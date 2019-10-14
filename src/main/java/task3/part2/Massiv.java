package task3.part2;

import java.util.Scanner;

/**
 * Задание 3.2
 * Поиск самого длинного слова (максимального элемента в массиве).
 *
 * created by Victoria
 */
public class Massiv {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

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
        sc.close();
    }
}
