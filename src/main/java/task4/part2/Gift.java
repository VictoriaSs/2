package task4.part2;

import task4.part2.gift.Sweet;

import java.util.ArrayList;
import java.util.List;

class Gift {

    private List<Sweet> sostav = new ArrayList<>();
    private double totalPrice = 0;
    private double totalWeight = 0;

    void addSweet(Sweet sweet) {
        System.out.println("Собираю подарок: " + sweet);
        sostav.add(sweet);
        totalPrice += sweet.getPrice();
        totalWeight += sweet.getWeight();
    }

    List<Sweet> getSostav() {
        return sostav;
    }

    double getTotalPrice() {
        return totalPrice;
    }

    double getTotalWeight() {
        return totalWeight;
    }
}
