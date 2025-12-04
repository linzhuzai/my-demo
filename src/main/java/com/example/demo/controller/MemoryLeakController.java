package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class MemoryLeakController {

    private static final List<byte[]> LEAK_BUCKET = new ArrayList<>();

    @GetMapping("/leak")
    public String leak(@RequestParam(defaultValue = "5") int mb) {
        // 每次请求往静态 List 里塞 N MB 的 byte[]
        int size = mb * 1024 * 1024;
        LEAK_BUCKET.add(new byte[size]);
        return "allocated " + mb + "MB, total chunks=" + LEAK_BUCKET.size();
    }
}