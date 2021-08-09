package com.example.demo.inheritance;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
class BusinessMen {
    private String name;

}

@Data
class BusinessMens extends BusinessMen{
    private final String company;
    private final String position;

}