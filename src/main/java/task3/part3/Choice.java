package task3.part3;

import java.util.Scanner;

/**
 * Задание 3.3
 *
 * created by Victoria
 */
public class Choice {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Выберите программу:");
        System.out.println("1- Калькулятор");
        System.out.println("2- Массив");

        int a;
        a = sc.nextInt();
        if (a == 1) {

            System.out.println("Введите первое число:");
            double i = sc.nextDouble();

            System.out.println("Выберите операцию:");

            String str;
            str = sc.next();

            System.out.println("Введите второе число:");
            double j = sc.nextDouble();

            double result = 0;

            if (str.equals("+")) {
                result = i + j;
            } else {
                if (str.equals("-")) {
                    result = i - j;
                } else {
                    if (str.equals("*")) {
                        result = i * j;
                    } else {
                        if (str.equals("/")) {
                            result = i / j;
                        } else {
                            System.out.println("Ошибка. Выберите операцию сложения, вычитания, деления или умножения");
                        }
                    }
                }
            }
            System.out.print("Результат: ");
            System.out.printf("%.4f", result);

        }

        if (a == 2) {

            System.out.println("Введите количество слов в массиве:");
            int i = sc.nextInt();

            String[] mas = new String[i];
            System.out.println("Введите слова массива:");
            for (int y = 0; y < mas.length; y++) {
                String s = sc.next();
                mas[y] = s;
            }

            int size = -1;
            int pos = -1;
            for (int y2 = 0; y2 < mas.length; y2++) {
                String element = mas[y2];
                if (size < element.length()) {
                    size = element.length();
                    pos = y2;
                }
            }
            System.out.println("Самое длинное слово в массиве: " + mas[pos]);

        }
        sc.close();
    }
}
