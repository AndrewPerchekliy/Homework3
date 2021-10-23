package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static class Calculator {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1,num2,operation);
            System.out.println("Результат операции: "+result);
        }
        public static char getOperation(){
            System.out.println("Введите знак:");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("НЕПРАВИЛЬНО Попробуй еще раз.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        public static int getInt(){
            System.out.println("Введите число:");
            int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("НЕПРАВИЛЬНО ПОПРОБУЙ ЕЩЕ РАЗ.");
                scanner.next();
                num = getInt();
            }
            return num;
        }

        public static int calc(int num1, int num2, char operation){
            int result;
            int test = 0;
            String getOperation = new String();
            if (getOperation.contains("=")) {
                test ++;
                System.out.println(getOperation());
                getOperation = checkcalс(scanner.nextLine(), scanner);

            }
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, getOperation());
            if (test >= 1){
                result = calc(num1, num2, getOperation());
            }else{
                return operation;
            }
            }
            return result;
        }
        private static String checkcalс(final String brand, final Scanner scanner) {
            String getOperation = new String();
            if (getOperation.toLowerCase(Locale.ROOT).contains("=")) {
                System.out.println(getOperation());
                getOperation = checkcalс(scanner.nextLine(), scanner);

            }

            return getOperation;
        }
}
}