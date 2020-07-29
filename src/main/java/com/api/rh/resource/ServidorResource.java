package com.api.rh.resource;

import com.api.rh.model.Servidor;
import com.api.rh.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/servidores")
public class ServidorResource {

    @Autowired
    private ServidorRepository servidorRepository;

    @GetMapping
    public List<Servidor> listar() {
        return servidorRepository.findAll();
    }
}
