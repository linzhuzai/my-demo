package com.example.demo;

import cn.hutool.core.util.StrUtil;
import com.example.demo.deadlock.LockDead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

@SpringBootApplication
public class DemoApplication {


//    public static void sort(int[] nums, int low, int high) {
//        if(low < high) {
//            int base = subSort(nums, low, high);
//            sort(nums, low, base -1);
//            sort(nums, base + 1, high);
//        }
//    }
//    public static int subSort(int[] nums, int low, int high) {
//        int base = nums[low];
//        while(low < high) {
//            while(low < high && nums[high] >= base){
//                high--;
//            }
//            nums[low] = nums[high];
//            while(low < high && nums[low]<=base){
//                low++;
//            }
//            nums[high] = nums[low];
//        }
//        nums[high] = base;
//        return high;
//    }
//
//    public static void longestConsecutive(int[] nums) {
//        int len = nums.length;
////        for (int i = 0; i < len - 1; i++) {
////            for (int j = 0; j < len - i - 1; j++) {
////                if(nums[j] > nums[j+1]) {
////                    int t = nums[j];
////                    nums[j] = nums[j+1];
////                    nums[j+1] = t;
////                }
////            }
////        }
////        for (int i = 0; i < len - 1; i++) {
////            int min = i;
////            for (int j = i+1; j < len; j++) {
////                if(nums[min] > nums[j]) {
////                    min = j;
////                }
////            }
////            if(min != i) {
////                int t = nums[i];
////                nums[i] = nums[min];
////                nums[min] = t;
////            }
////        }
//
//        sort(nums, 0, nums.length-1);
//        System.out.println(Arrays.toString(nums));
//    }
//
//    static void sort(int[] arr) {
//        int len = arr.length;
//        for(int i=0;i<len-1;i++) {
//            for(int j=0;j<len-i-1;j++){
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void main(String[] args) {
//        int[] arr = {5, 3, 8, 4, 2};
//        sort(arr);
//        longestConsecutive(arr);
//        String readType = "";
//        String downType = "";
//        String handleType = StrUtil.isNotBlank(readType) && StrUtil.isNotBlank(downType) ? String.join(",", readType, downType) : StrUtil.blankToDefault(readType, downType);
//        System.out.println(handleType);

        SpringApplication.run(DemoApplication.class, args);
//
//        LockDead lo = new LockDead();
//        lo.calculateDiscount(BigDecimal.ONE);
    }


}
