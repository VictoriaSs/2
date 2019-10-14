package task4.part1;

import java.util.Random;

public class Min {
    //определяем кол-во элементов в массиве, диапазон от -10 до 10 и 0 включительно, итого 21 символ
    private int[] Mas = new int[21];
    private int i;


    public void massivGeneration() {

        //Заполняем массив случайных чисел в диапазоне -10 до 10 и 0 включительно и выводим на экран
        Random random = new Random();
        for (i = 0; i < Mas.length; i++) {
            Mas[i] = random.nextInt(21) - 10;
            System.out.println(i + " элемент массива = "+Mas[i]);
        }
    }

    public void setI(int i) {this.i = i;}

    public int getIndex(){ return Mas[i];}

    public int[] getMas() { return Mas;}
}

