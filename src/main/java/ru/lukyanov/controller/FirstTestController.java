package ru.lukyanov.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstTestController {

    // localhost8080/first/test-one?name=Kirill&nickName=Kirs
    @GetMapping
    public String testMethodOne(HttpServletRequest request) {

        String name = request.getParameter("name");
        String nickName = request.getParameter("nickName");
        System.out.printf("Hello from HttpServletRequest, your name is %s and nick name is %s", name, nickName);

        return "first/test-one";
    }

    @GetMapping("/second")
    public String testMethodTwo(@RequestParam("name") String name, @RequestParam(value = "nickName", required = false) String nickName) {

        System.out.printf("Hello from @RequestParam, your name is %s and nick name is %s", name, nickName);

        return "first/test-two";
    }
}
