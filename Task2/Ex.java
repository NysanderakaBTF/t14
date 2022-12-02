package ru.mirea.task14.Task2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex {

    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static boolean isDate(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String[] args) {

        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("asdzfgh21312312312d4yt5y5"));
        System.out.println();

        System.out.println(findRubEurUsd("222.3 RUB, 213 213 12 dq3.789USD"));
        System.out.println();

        System.out.println(hasDigitPlus("(1 + 8) - 9/4"));
        System.out.println(hasDigitPlus("6/5 -2*9"));
        System.out.println();

        System.out.println(isDate("22/09/2022"));
        System.out.println(isDate("13/6/980"));

        System.out.println();
        System.out.println(checkEmail("littlrfox@gmail.com"));
        System.out.println(checkEmail("ewq rehe er ewgergeqw@egg grg .com"));
        System.out.println(checkEmail("rht.@.ya.com"));
        System.out.println(checkEmail("a@@@@@@@mail.ru"));

        System.out.println();
        System.out.println(checkPass("password"));
        System.out.println(checkPass("Googp_a1ss"));
    }
}