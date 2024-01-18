package ru.lukyanov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondTestController {

    @GetMapping("/exit")
    public String exit(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "User " + name + " ready to exit");

        return "second/exit";
    }

}
