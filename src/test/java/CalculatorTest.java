
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import task8.Calculator;
import task8.Operand;
import task8.Operation;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testValidAddition() {
        Calculator calc = new Calculator(new Operand(2), new Operand(2), Operation.ADDITION);
        assertEquals("2 + 2 = 4", 4, calc.getResult(), 0.1);
    }

    @Test
    public void testValidSubstraction() {
        Calculator calc = new Calculator(new Operand(2), new Operand(2), Operation.SUBTRACTION);
        assertEquals("2 - 2 = 0", 0, calc.getResult(), 0.1);
    }

    @Test
    public void testValidMultiplication() {
        Calculator calc = new Calculator(new Operand(2), new Operand(3), Operation.MULTIPLICATION);
        assertEquals("2 * 3 = 6", 6, calc.getResult(), 0.1);
    }

    @Test
    public void testValidDivision() {
        Calculator calc = new Calculator(new Operand(2), new Operand(2), Operation.DIVISION);
        assertEquals("2 / 2 = 1", 1, calc.getResult(), 0.1);
    }
}

