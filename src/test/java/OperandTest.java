import org.junit.Before;
import org.junit.Test;
import task8.Operand;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperandTest {

    private static final double INIT_VALUE = 0;
    private Operand operand;

    @Before
    public void setUp() throws Exception {
        operand = new Operand(INIT_VALUE);
    }

    @Test
    public void getValue() {
        assertEquals("Значение операнда не должно меняться после создания", INIT_VALUE, operand.getValue(), 0.000001);
    }
}

