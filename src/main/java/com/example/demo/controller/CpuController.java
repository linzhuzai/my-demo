package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CpuController {

    @GetMapping("/cpu")
    public String cpu(@RequestParam(defaultValue = "500") long loops) {
        long sum = 0;
        for (long i = 0; i < loops * 1_000_000L; i++) {
            sum += i % 3;
        }
        return "sum=" + sum;
    }
}