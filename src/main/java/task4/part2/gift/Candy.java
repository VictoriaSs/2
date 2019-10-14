package task4.part2.gift;

public class Candy implements Sweet {

    private double candyWeight;
    private double candyPrice;
    private String sweetnessRate;

    public Candy(double candyWeight, double candyPrice, String sweetnessRate) {
        this.candyWeight = candyWeight;
        this.candyPrice = candyPrice;
        this.sweetnessRate = sweetnessRate;
    }

    @Override
    public double getWeight() {
        return this.candyWeight;
    }

    @Override
    public double getPrice() {
        return this.candyPrice;
    }

    private String getSweetnessRate() {
        return this.sweetnessRate;
    }

    @Override
    public String toString() {
        return "candy: " + getSweetnessRate();
    }
}
