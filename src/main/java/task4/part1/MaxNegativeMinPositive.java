package task4.part1;



import java.util.Arrays;

import java.util.Random;



/**

 * Задание 4.1

 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.

 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.

 *

 * @author Victoria

 */

public class MaxNegativeMinPositive {

    public static void main(String[] args) {

        int n = 20;

        int[] array = new int[n];

        Random rand = new Random();

        int i;

        int maxNegative = -11, minPositive = 11, negativePosition = -1, positivePosition = -1;

        for (i = 0; i < n; ++i) {

            int randomInt = rand.nextInt(21) - 10;

            if ((randomInt < 0) && (randomInt > maxNegative)) {

                maxNegative = randomInt;

                negativePosition = i;

            } else if ((randomInt > 0) && (randomInt < minPositive)) {

                minPositive = randomInt;

                positivePosition = i;

            }

            array[i] = randomInt;

        }

        System.out.println(Arrays.toString(array));

        System.out.println(maxNegative + ", " + minPositive);

        System.out.println(negativePosition + ", " + positivePosition);



        int swap = array[negativePosition];

        array[negativePosition] = array[positivePosition];

        array[positivePosition] = swap;



        System.out.println(Arrays.toString(array));

    }

}