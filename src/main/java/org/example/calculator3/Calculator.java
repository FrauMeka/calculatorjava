package org.example.calculator3;

public class Calculator {
    private double operand1;   // Stores the first operand
    private double operand2;   // Stores the second operand
    private char operator;     // Stores the arithmetic operator
    private double result;     // Stores the result of the operation
    private boolean isError;   // Indicates if an error occurred

    public void setOperand1(double operand) {
        this.operand1 = operand;
    }

    public void setOperand2(double operand) {
        this.operand2 = operand;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        isError = false; // Reset error flag
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    isError = true; // Division by zero error
                    result = 0;     // Default result on error
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                isError = true; // Invalid operator error
                break;
        }
    }

    public double getResult() {
        return result;
    }

    public double getOperand1() { // Add getter for operand1
        return operand1;
    }

    public double getOperand2() { // Add getter for operand2
        return operand2;
    }

    public char getOperator() { // Add getter for operator
        return operator;
    }

    public boolean isError() {
        return isError;
    }

    public void reset() {
        operand1 = 0;
        operand2 = 0;
        operator = '\0';
        result = 0;
        isError = false;
    }
}
