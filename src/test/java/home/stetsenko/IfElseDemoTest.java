package home.stetsenko;

import home.stetsenko.strategy.IfElseDemo;
import org.junit.Test;

import static org.junit.Assert.*;

public class IfElseDemoTest {

    @Test
    public void testLow() throws Exception {
        assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void medium() {
        assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void high() {
        assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void veryHigh() {
        assertEquals(106400, insuranceFor(100000), 0.01);
    }

    private double insuranceFor(int income) {
        return new IfElseDemo().calculateInsurance(income);
    }

}