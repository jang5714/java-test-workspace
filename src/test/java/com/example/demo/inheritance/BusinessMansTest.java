package com.example.demo.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BusinessMansTest {
    @Mock BusinessMens businessMens;
    @BeforeEach
    void setUp() {
        businessMens.setName("이순신");
        businessMens = new BusinessMens("구글","개발자");
    }
    @Test
    public void test_show_man(){
        assertEquals("이순신",businessMens.getName());
        assertEquals("구글",businessMens.getCompany());
        assertEquals("개발자",businessMens.getPosition());
    }
}