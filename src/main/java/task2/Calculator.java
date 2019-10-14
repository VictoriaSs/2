package task2;

import java.util.Scanner;

/**
 * Задание 2
 *
 * Калькулятор. Сложение дробных чисел
 */
public class Calculator {

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
        System.out.println("Введите второе число:");
        double j = sc.nextDouble();
        double sum = i + j;
        System.out.print("Сумма равна: ");
        System.out.printf("%.4f", sum);
        sc.close();
    }
}
