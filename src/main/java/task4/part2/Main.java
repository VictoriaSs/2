package task4.part2;

import task4.part2.gift.Candy;
import task4.part2.gift.Cookie;
import task4.part2.gift.Cake;

/**
 * Задание 4.2
 * Собираем подарок
 * created by Victoria
 */
public class Main {

    public static void main(String[] args) {

        Gift podarok = new Gift();
        podarok.addSweet(new Candy(10, 100, "сладкий вкус"));
        podarok.addSweet(new Candy(10, 100, "кислый вкус"));
        podarok.addSweet(new Cookie(10, 100, 10));
        podarok.addSweet(new Cake(10, 100, 5));
        System.out.println("Общий вес: " + podarok.getTotalWeight() + ", общая стоимость: " + podarok.getTotalPrice());
        System.out.println("Состав подарка: " + podarok.getSostav());
        System.out.println("Подарок собран");
    }
}
