package com.example.demo.Controllers;

import com.example.demo.Entities.User;
import com.example.demo.Services.UserDetailsServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserDetailsServiceUtil userDetailsServiceUtil;

    @GetMapping("/reg")
    public ModelAndView getRegistrationForm(){
        return new ModelAndView("reg");
    }

    @PostMapping("/reg")
    public ModelAndView registrUser(@RequestParam Map<String, String> params, ModelMap model) {
        System.out.println(params.get("username"));
        System.out.println(params.get("password"));
        User newUser = userDetailsServiceUtil.registrUser(params.get("username"), params.get("password"));
        model.put("user", newUser);
        if (newUser == null)
            return new ModelAndView("reg", model);
        else
            return new ModelAndView("redirect:/login", model);
    }
}
