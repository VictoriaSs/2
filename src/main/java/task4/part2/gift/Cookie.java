package task4.part2.gift;

public class Cookie implements Sweet {

    private double cookieWeight;
    private double cookiePrice;
    private int amountInPackage;

    public Cookie(double cookieWeight, double cookiePrice, int amountInPackage) {
        this.cookieWeight = cookieWeight;
        this.cookiePrice = cookiePrice;
        this.amountInPackage = amountInPackage;
    }

    @Override
    public double getWeight() {
        return this.cookieWeight;
    }

    @Override
    public double getPrice() {
        return this.cookiePrice;
    }

    private int getAmountInPackage() {
        return amountInPackage;
    }

    @Override
    public String toString() {
        return "cookie: " + getAmountInPackage();
    }
}
