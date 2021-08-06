package com.example.demo.Person;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@Data @RequiredArgsConstructor
public class Person {
    private String regiNum;
    public  String passNum;

    public Person(String rnum, String pnum){
        regiNum = rnum;
        passNum = pnum;
    }
    public Person(String rnum){
        regiNum = rnum;
    }
}
