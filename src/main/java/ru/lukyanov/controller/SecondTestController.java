package ru.lukyanov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondTestController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
