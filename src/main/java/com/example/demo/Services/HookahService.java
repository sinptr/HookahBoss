package com.example.demo.Services;

import com.example.demo.Entities.Hookah;
import com.example.demo.Repositories.HookahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HookahService {
    @Autowired
    HookahRepository hookahRepository;

    public Hookah getHookah(long id){
        return hookahRepository.findOne(id);
    }

    public Iterable getHookahs(){
        return hookahRepository.findAll();
    }

    public Iterable<Hookah> hookahSearch(String query){
        // todo implement dis shit
        return null;
    }
}
