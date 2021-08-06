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
class MyCalculatorTest {
    @Mock
    MyCalculator myCalculator;

    @BeforeEach
    void setup (){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }
    @Test
    void plus() {
        assertEquals(10,myCalculator.plus(4,6));
    }
    @Test
    void minus() {
        assertEquals(-2,myCalculator.minus(4,6));
    }
    @Test
    void division() {
        assertEquals(2,myCalculator.division(4,2));
    }
    @Test
    void multi() {
        assertEquals(24,myCalculator.multi(4,6));
    }
}