package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operand leftOperand, rightOperand;
        Operation operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести первое число:");
        leftOperand = new Operand(scanner.nextDouble());

        System.out.println("Выбрать операцию:");
        operation = Operation.getBySymbol(scanner.next().charAt(0));

        System.out.println("Ввести второе число:");
        rightOperand = new Operand(scanner.nextDouble());

        Calculator calc = new Calculator(leftOperand, rightOperand, operation);

        System.out.println("Результат: " + calc.getResult());

        scanner.close();
    }
}
