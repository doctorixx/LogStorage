package ru.doctorixx.applogstorage.controller;

import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class LogoutController {
    @GetMapping("/logout")
    public String logout(){
        return "redirect:/login?logout";
    }
}
