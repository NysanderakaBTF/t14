package ru.mirea.task14.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Input Line:");
        System.out.println("input separate:");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}