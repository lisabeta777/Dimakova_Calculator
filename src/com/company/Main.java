package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean result = false;
        while (!result) {
            System.out.println("Введите первую цифру");
            int a = in.nextInt();
            System.out.println("Введите оператор: '+', '-', '*' или '/'");
            String sign = in.next();
            System.out.println("Введите вторую цифру");
            int b = in.nextInt();
            System.out.println("Результат вычисления");

            switch (sign) {
                case "+":
                    System.out.println(Plus.execute(a, b));
                    break;
                case "-":
                    System.out.println(Minus.execute(a, b));
                    break;
                case "*":
                    System.out.println(Multiplied.execute(a, b));
                    break;
                case "/":
                    System.out.println(Division.execute(a, b));
                    break;
                default:
                    result = true;
                    break;
            }
        }
        }

    }


