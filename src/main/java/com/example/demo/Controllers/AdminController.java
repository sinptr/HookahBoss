package com.example.demo.Controllers;

import com.example.demo.Services.UserDetailsServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminController {

    @Autowired
    UserDetailsServiceUtil service;

    @GetMapping
    public String get(ModelMap model){
        model.addAttribute("users", service.getUsers());
        return "admin";
    }

}
