package com.api.rh.resource;

import com.api.rh.event.RecursoCriadoEvent;
import com.api.rh.model.Servidor;
import com.api.rh.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/servidores")
public class ServidorResource {

    @Autowired
    private ServidorRepository servidorRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Servidor> listar() {
        return servidorRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Servidor> criar(@Valid @RequestBody Servidor servidor, HttpServletResponse response) {
        final Servidor servidorSalvo = servidorRepository.save(servidor);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, servidorSalvo.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(servidorSalvo);
    }
}
