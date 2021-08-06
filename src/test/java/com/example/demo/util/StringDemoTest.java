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
class StringDemoTest {
    @Mock
    StringDemo s;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        s = new StringDemo();
    }
    @Test
    void concat() {
        assertEquals("CoffeeBread",s.concat("Coffee","Bread"));
    }
    @Test
    void substring() {
        assertEquals("fee",s.substring("Coffee",3));
    }
    @Test
    void testSubstring() {
        assertEquals("ff",s.substring("Coffee",2,4));
    }
    @Test
    void compareTa() {
        assertEquals(0,s.compareTo("Lexicographically","Lexicographically"));
    }
    @Test
    void compareToIgnoreCase() {
        assertEquals(0,s.compareToIgnoreCase("Lexicographically","lexicographically"));
    }
    @Test
    void removeHyponeInJuminBunha() {
        assertEquals("990925 1012999",s.removeHyponeInJuminBunha("990925-1012999"));
    }
}