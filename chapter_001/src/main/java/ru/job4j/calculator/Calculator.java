package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * Base operation result.
     */
    private double result;
    /**
     * Method add.
     * @param first - first param for add.
     * @param second - second param for add.
     */
    public void add(double first, double second) {
	this.result = first + second;
    }
    /**
     * Method returns result.
     * @return result
     */
    public double getResult() {
        return this.result;
    }
    /**
     * Method sub (subtraction).
     * @param first - first param for subtraction.
     * @param second - second param for subtraction.
     */
    public void sub(double first, double second) {
     this.result = first - second;
    }
    /**
     * Method multi (multiplication).
     * @param first - first param for multiplication.
     * @param second - second param for multiplication.
     */
    public void multi(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method div (division).
     * @param first - first param for division.
     * @param second - second param for division.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
}
