package com.example.recyclerview.animals;

public class Utils {
    public static String addDote (String s){
        s += '.';
        return s;
    }

    public static int chooseMin(int a, int b){
        if(a <= b) return a;
        else return b;
    }

}
