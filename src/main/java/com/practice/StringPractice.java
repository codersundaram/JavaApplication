package com.practice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println(getName(name));
    }

    public static String getName(String name){
        return name;
    }
}
