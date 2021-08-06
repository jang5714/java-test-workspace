package com.example.demo.util;

public class StringDemo {
    public String concat(String s1, String s2){
        return s1.concat(s2);
    }
    public String substring(String s, int idx){
        return s.substring(idx);
    }
    public String substring(String s, int start, int end){
        return s.substring(start, end);
    }
    public int compareTo(String s1, String s2){
        return s1.compareTo(s2);
    }
    public int compareToIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public String removeHyponeInJuminBunha(String juminBunha){
        return juminBunha.replace("-"," ");
    }
}
