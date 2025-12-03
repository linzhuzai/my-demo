package com.example.demo.jvm;

import java.util.ArrayList;
import java.util.List;

public class YoungGcDemo {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> holder = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            // 每次创建一个 512KB 的数组，短时间内就让引用失效
            byte[] b = new byte[512 * 1024];
            // 模拟一部分对象会“存活久一点”
            if (i % 10 == 0) {
                holder.add(b);
            }
            // 稍微停一下，方便观察 GC（实际练习时可以配合 GC 日志）
            Thread.sleep(10);
        }
    }
}