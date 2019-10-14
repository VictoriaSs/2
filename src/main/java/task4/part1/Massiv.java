package task4.part1;

import task4.part1.Min;


public class Massiv{

    public static void main(String[] args) {

        Min New = new Min();
        New.massivGeneration();

        int f=0;
        int z=0;
        int a=16;

        for (int j=0; j<New.getMas().length; j++)
        {
            New.setI(j);
            //h запоминает элемент массива под интдексом j
            int h= New.getIndex();
            //Находим максимально отрицательный элемент массива, ноль не учитываем
            if (h<f && h<z)
            {
                z=h;
            }
            //Находим минимальный положительный элемент массива, ноль не учитываем
            if (h > f && h < a) {
                a = h;
            }

        }
        System.out.println("Максимально отрицательный элемент массива = " + z);
        System.out.println("Минимальный положительный элемент массива = " + a);

        System.out.println("Новый массив:");
//Меняем местами найденные нами элементы массива и выводим полученный массив
        for (int l=0; l<New.getMas().length; l++) {
            New.setI(l);
            int h= New.getIndex();
            if (h == a) {
                h = z;
            } else if (h == z) {
                h=a;
            }

            System.out.println(l + " элемент массива = "+h);
        }
    }

}

