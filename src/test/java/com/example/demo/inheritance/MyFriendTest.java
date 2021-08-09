package com.example.demo.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MyFriendTest {
    @Mock MyFriend myFriend;

    @BeforeEach
    void setUp() {
        myFriend = new MyFriend();
    }

    @Test
    void getFriends() {
        Friend[] arr = myFriend.getFriends();
        for(Friend f : arr){
            System.out.println(f.toString());
        }
        assertEquals("YOON", arr[2].getName());
    }
}