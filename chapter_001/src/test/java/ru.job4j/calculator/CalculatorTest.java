package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CalculatorTest.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     *  Method test addition.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     *  Method test subtraction.
     */
    @Test
    public void whenSubTwoSubtractionOneThenOne() {
        Calculator calc = new Calculator();
        calc.sub(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     *  Method test multiplication.
     */
    @Test
    public void whenMultiTwoMultiplicationOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multi(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     *  Method test division.
     */
    @Test
    public void whenDivFourDivisionTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
