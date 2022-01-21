package com.company.algorithm.chapter1;

import java.util.Scanner;

public class UpperAndLowerConversion {

    public String solution(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                result += Character.toUpperCase(x);
            } else {
                result += Character.toLowerCase(x);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        UpperAndLowerConversion u = new UpperAndLowerConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(u.solution(str));
    }

}
