package com.example.demo.Person;

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
class PersonTest {

    @Mock Person jang;
    @Mock Person hong;
    @BeforeEach void setup(){
        MockitoAnnotations.initMocks(this);
        jang = new Person("335577", "112233");
        hong = new Person("775544");
    }
    @Test
    void showPersonalInfo(){
        assertEquals("335577",jang.getRegiNum());
        assertEquals("112233", jang.getPassNum());
        assertEquals(null, hong.getPassNum());
        assertEquals("775544", hong.getRegiNum());
        }
    }
