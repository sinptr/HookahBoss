package com.example.demo.Controllers;

import com.example.demo.Entities.Hookah;
import com.example.demo.Repositories.HookahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    HookahRepository hookahRepository;

    @GetMapping("/")
    public Iterable<Hookah> test(){
        return hookahRepository.findAll();
    }
}
