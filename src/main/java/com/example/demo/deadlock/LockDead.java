package com.example.demo.deadlock;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;

@Component
public class LockDead {

    // 另一个常见问题：递归深度过大
    public void calculateDiscount(BigDecimal total) {
//        // 模拟递归调用
//        System.out.println(total);
//        return calculateDiscount(total);
        while (true) {  // 缺少退出条件
            System.out.println(total);
        }
    }
}