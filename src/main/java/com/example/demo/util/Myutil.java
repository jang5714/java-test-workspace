package com.example.demo.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Myutil {
    public String findXmaxEve(LocalDate today, int month, int date){
        Period left = Period.between(today.now(), LocalDate.of(today.now().getYear(), month, date));
        return String.format("%s 까지 남은 %s 개월, %s 일",left.getYears(),left.getMonths(),left.getDays());
    }
    public String usedTime(String hour1, String min1, String sea1,
                           String hour2, String min2, String sea2){

        return "총 PC 이용 시간: " + getTime((int)Duration.between(
                getLoalTime(hour1,min1,sea1),getLoalTime(hour2,min2,sea2)).getSeconds());
    }
    private LocalTime getLoalTime(String hour, String min, String sea){
        return LocalTime.of(Integer.parseInt(hour),Integer.parseInt(min),Integer.parseInt(sea));
    }
    private String getTime(int sec){
        int second = sec % 60;
        int hour = sec/(60*60);
        int minute = (sec - hour*(60*60))/60;
        return String.format("%d 시간, %d 분, %s 초", hour, minute, second);
    }
}
