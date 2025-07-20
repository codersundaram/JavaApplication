package com.practice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println(getName(name));
        System.out.println(getReverseName("Earth"));
    }

    public static String getName(String name){
        return name;
    }

    public static int getLength(String name){
        return name.length();
    }

    public static String getReverseName(String name){
        char[] l = name.toCharArray();
        String reverse = "";
        for(int i = l.length -1; i>=0; i--){
            reverse = reverse.concat(String.valueOf(l[i]));
        }
        return reverse;
    }
}
