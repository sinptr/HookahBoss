package com.example.demo.Services;

import com.example.demo.Entities.Manufacturer;
import com.example.demo.Repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    public Iterable getManufacturers() {
        return manufacturerRepository.findAll();
    }

    public Manufacturer getManufacturer(long id){
        return manufacturerRepository.findOne(id);
    }
}
