package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 DevSecOps CI/CD Pipeline is Working Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP and running.";
    }
}
