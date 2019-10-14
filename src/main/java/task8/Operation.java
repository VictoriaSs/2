package task8;

public enum Operation {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private char operationSymbol;

    Operation(char symbol) {
        this.operationSymbol = symbol;
    }

    public static Operation getBySymbol(char symbol) {
        for (Operation operation : Operation.values()) {
            if (operation.operationSymbol == symbol) {
                return operation;
            }
        }
        throw new UnsupportedOperationException("Знак \"" + symbol + "\" не используется данной версией калькулятора. " +
                "Выберите корректный знак операции: +, -, *, /");
    }
}
