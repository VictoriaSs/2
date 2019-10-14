package task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operand leftOperand, rightOperand;
        Operation operation;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число:");
            leftOperand = new Operand(scanner.nextDouble());

            System.out.println("Выберите операцию:");
            operation = Operation.getBySymbol(scanner.next().charAt(0));

            System.out.println("Введите второе число:");
            rightOperand = new Operand(scanner.nextDouble());

            Calculator calc = new Calculator(leftOperand, rightOperand, operation);

            System.out.println("Результат: " + calc.getResult());
        } catch (RuntimeException e) {
            System.out.println("Ошибка:" + e.getLocalizedMessage());
        }
    }
}
