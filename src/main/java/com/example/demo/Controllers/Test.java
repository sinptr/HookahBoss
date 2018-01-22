package com.example.demo.Controllers;

import com.example.demo.Entities.Hookah;
import com.example.demo.Repositories.HookahRepository;
import com.example.demo.Services.HookahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hookah")
public class Test {

    @Autowired
    HookahRepository hookahRepository;

    @Autowired
    HookahService hookahService;

    @GetMapping
    public String getPersons(ModelMap model){
        model.addAttribute("hookahs", hookahService.getHookahs());
        return "hookahs";
    }

    @GetMapping("/{id}")
    public String getHookah(@PathVariable long id, ModelMap model){
        model.addAttribute("hookah", hookahService.getHookah(id));
        return "hookah";
    }
}
