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
class MyutilTest {
    @Mock
    Myutil myutil;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myutil = new Myutil();
    }
    @DisplayName("입력한 날짜까지 앞으로 며칠 남았는가 ?")
    @Test
    void findXmaxEve() {
        System.out.println(myutil.findXmaxEve(LocalDate.now(), 12, 25));
    }
    @Test
    void FullTime(){
        System.out.println(myutil.usedTime("9","30","00","18","00","00"));
    }
}