package com.example.demo.Controllers;

import com.example.demo.Entities.User;
import com.example.demo.Services.UserDetailsServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserDetailsServiceUtil userDetailsServiceUtil;

    @GetMapping
    public ModelAndView getRegistrationForm(){
        return new ModelAndView("reg");
    }

    @PostMapping("/reg")
    public ModelAndView registrUser(@RequestParam Map<String, String> params, ModelMap model) {
        System.out.println(params.get("username"));
        System.out.println(params.get("password"));
        User newUser = userDetailsServiceUtil.registrUser(params.get("username"), params.get("password"));
        model.put("user", newUser);
        return new ModelAndView("reg", model);
    }
}
