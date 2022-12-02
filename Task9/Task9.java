package ru.mirea.task14.Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        buildDictionary(text);
    }
    static void buildDictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }
}
