package com.company;
import java.util.Scanner;

public class Operation {
    int a;
    int b;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean result = false;
        while (!result){
            result = false;
        int a = in.nextInt();
        String sign = in.next();
        int b = in.nextInt();

        if (sign.equals("+")) Plus.plus(a, b);
        else if (sign.equals("-")) Minus.minus(a, b);
        else if (sign.equals("*")) Multiplied.multiplied(a, b);
        else if (sign.equals("/")) division.division(a, b);
        else result = true;}
    }

}

