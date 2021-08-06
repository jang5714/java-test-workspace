package com.example.demo.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock ArrayDemo arrayDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void fill() {
        String s = "";
        int[] arr = arrayDemo.fill(7);
        for(int i : arr){
            s += i;
        }
        assertEquals("77777",s);
    }

    @Test
    void copy() {
        String s = "";
        int[] arr = arrayDemo.copy(new int[]{7,7,7,7,7},0,2,2);
        for (int i : arr){
            s += i;
        }
        assertEquals("00770",s);
    }
}