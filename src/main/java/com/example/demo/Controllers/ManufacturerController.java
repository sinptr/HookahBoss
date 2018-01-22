package com.example.demo.Controllers;

import com.example.demo.Repositories.ManufacturerRepository;
import com.example.demo.Services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ManufacturerController {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping("/models")
    public String getModels(ModelMap model){
        model.addAttribute("models", manufacturerService.getManufacturers());
        return "models";
    }
    @GetMapping("/model/{id}")
    public String getHookahForModel(@PathVariable long id, ModelMap model){
        model.addAttribute("hookahs", manufacturerService.getManufacturer(id).getHookahs());
        return "hookahs";
    }
}
