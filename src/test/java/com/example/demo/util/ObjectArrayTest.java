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
class ObjectArrayTest {
    @Mock
    ObjectArray objectArray;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        objectArray = new ObjectArray();
    }
    @Test
    void creatCart() {
        Product[] arr = objectArray.creatCart();
        for ( Product e : arr){
            System.out.println(e.toString());
        }
        assertEquals("Coffee",arr[0].getDescription());
    }
}