package task4.part2.gift;

public class Cake implements Sweet {


        private double cakeWeight;
        private double cakePrice;
        private int amountInPackage;

        public Cake(double cakeWeight, double cakePrice, int amountInPackage) {
            this.cakeWeight = cakeWeight;
            this.cakePrice = cakePrice;
            this.amountInPackage = amountInPackage;
        }

        @Override
        public double getWeight() {
            return this.cakeWeight;
        }

        @Override
        public double getPrice() {
            return this.cakePrice;
        }

        private int getAmountInPackage() {
            return amountInPackage;
        }

        @Override
        public String toString() {
            return "cake: " + getAmountInPackage();
        }
    }


