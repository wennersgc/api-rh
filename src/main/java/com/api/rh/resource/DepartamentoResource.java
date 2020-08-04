package com.api.rh.resource;

import com.api.rh.event.RecursoCriadoEvent;
import com.api.rh.model.Departamento;
import com.api.rh.model.Servidor;
import com.api.rh.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoResource {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Departamento> listar() {
        return departamentoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Departamento> criar(@Valid @RequestBody Departamento departamento, HttpServletResponse response) {
        final Departamento departamentoSalvo = departamentoRepository.save(departamento);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, departamentoSalvo.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(departamentoSalvo);
    }
}
