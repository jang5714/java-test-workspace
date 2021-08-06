package com.example.demo.util;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public int[] fill(int number){
        int[] ar1 = new int[5];
        Arrays.fill(ar1, number);
        return ar1;
    }

    public int[] copy(int[] arr, int initval, int start, int lenght){
        int[] ar2 = new int[5];
        System.arraycopy(arr, initval, ar2, start,lenght);
        return ar2;
    }
}
