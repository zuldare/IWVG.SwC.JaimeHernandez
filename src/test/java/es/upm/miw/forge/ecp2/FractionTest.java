package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(1,2);
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1,fraction.getNumerator());
        assertEquals(1,fraction.getDenominator());
    }
    
    @Test 
    public void testFractionIntInt() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }

}