package com.example.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CalculatorController {

    @GetMapping("/calculate")
    public double calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation) {
        return switch (operation) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> {
                if (num2 == 0) throw new IllegalArgumentException("Cannot divide by zero");
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Invalid operation");
        };
    }
}
