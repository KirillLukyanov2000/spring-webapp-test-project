package ru.lukyanov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstTestController {
    @GetMapping
    public String testMethodOne() {
        return "first/test-one";
    }

    @GetMapping("/second")
    public String testMethodTwo() {
        return "first/test-two";
    }
}
