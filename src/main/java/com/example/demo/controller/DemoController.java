package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 新增文件或加到已有 Controller 里
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/slow")
    public String slow(@RequestParam(defaultValue = "2000") long delayMs) throws InterruptedException {
        // 模拟慢请求，默认 2000ms，可通过 ?delayMs=xxx 调整
        Thread.sleep(delayMs);
        return "ok";
    }
}