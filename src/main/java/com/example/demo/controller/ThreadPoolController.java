package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/demo")
public class ThreadPoolController {

    private final ThreadPoolTaskExecutor bizExecutor;

    public ThreadPoolController(@Qualifier("bizExecutor") ThreadPoolTaskExecutor bizExecutor) {
        this.bizExecutor = bizExecutor;
    }

    @GetMapping("/heavy")
    public String heavy(@RequestParam(defaultValue = "200") long workMs) throws Exception {
        Future<String> future = bizExecutor.submit(() -> {
            // 模拟耗时计算
            Thread.sleep(workMs);
            return "ok";
        });
        return future.get(5, TimeUnit.SECONDS); // 超时时间 5s
    }
}