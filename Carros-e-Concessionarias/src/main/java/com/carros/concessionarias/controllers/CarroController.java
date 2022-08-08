package com.carros.concessionarias.controllers;

import com.carros.concessionarias.controllers.entities.Carro;
import com.carros.concessionarias.controllers.entities.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

// lista o objeto
    @GetMapping
    public List<Carro> findall() {
        List<Carro> result = repository.findAll();
      return result;

    }

    //busca o objeto pelo id
    @GetMapping(value = "/{id}")
    public Carro buscaPorId(@PathVariable Long id) {
        Carro result = repository.findById(id).get();
        return result;
    }
    //faz o save
    @PostMapping
    public Carro Salvar(@RequestBody Carro carro) {
        Carro result = repository.save(carro);
        return result;

    }
}
