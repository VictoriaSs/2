package task3.part1;

import java.util.Scanner;

/**
 * Задание 3.1
 *
 * Базовые операции калькулятора: сложение, умножение, деление и вычитание
 */
public class ValidCalculator {

    /**
     * created by Victoria
     *
     * @param args Параметры
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

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
        System.out.print("Равно: ");
        System.out.printf("%.4f", result);

        sc.close();
    }
}
