package com.practice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        printNumbers(1,5);
    }
    public static String[] printNumbers(int start, int end) {
        String[] output = new String[end - start + 1];
        for (int i = start; i <= end; i++) {
            output[i - start] = "i = " + i;
            System.out.println(output[i - start]);
        }
        return output;
    }
}