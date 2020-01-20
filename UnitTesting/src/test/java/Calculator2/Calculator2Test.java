package Calculator2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class Calculator2Test {
    private Calculator2 calculator;

    @Before
    public void setup() {
        calculator = new Calculator2();
    }



    @Test(expected = IllegalArgumentException.class)
    public void testCalculateWithException() {

        calculator.calculate(0,2);

    }

    @Test
    public void substract() {
    }

    @Test
    public void multiply() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByNull() {
        calculator.divide(2,null);

    }
    @Test(expected = IllegalArgumentException.class)
    public void divideByZero() {
        calculator.divide(2,0);
    }

    @Test
    public void calculateIncome() {
    }
}