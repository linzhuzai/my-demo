package com.example.demo.jvm;

public class StackOverflowDemo {

    public static void main(String[] args) {
        recursive(0);
    }

    private static void recursive(int depth) {
        int[] bigArray = new int[1000]; // 局部数组引用在栈，真正数组对象在堆
        System.out.println("depth = " + depth);
        recursive(depth + 1);
    }
}