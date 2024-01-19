package ru.lukyanov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.lukyanov.enums.Operation;

@Controller
public class CalculatorController {
    @GetMapping("/second/calc")
    public String calculate(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("operation") String toOperation, Model model) {
        double db = b;
        double res = 0;
        Operation operation = Operation.valueOf(toOperation);
        switch (operation) {
            case ADD -> res = a + db;
            case DIVIDE -> res = a / db;
            case MULTIPLY -> res = a * db;
            case SUBTRACT -> res = a - db;
        }
        model.addAttribute("result", "Result is " + res);
        return "second/calc";
    }
}
