package com.api.rh.resource;

import com.api.rh.event.RecursoCriadoEvent;
import com.api.rh.model.Cargo;
import com.api.rh.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoResource {
    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Cargo> listar() {
        return cargoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cargo> criar(@Valid @RequestBody Cargo cargo, HttpServletResponse response) {
        Cargo cargoSalvo = cargoRepository.save(cargo);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, cargoSalvo.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(cargoSalvo);
    }
}
