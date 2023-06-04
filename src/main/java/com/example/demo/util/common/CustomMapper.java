package com.example.demo.util.common;

public class CustomMapper {

    private int operand1;
    private int operand2;
    private int result;

    public CustomMapper(int key, int value, String symbol) {
        this.operand1 = key;
        this.operand2 = value;
        this.result = getResult(symbol);
    }

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public int getResult(String symbol) {
        switch (symbol) {
            case "+":
                setResult(this.operand1 + this.operand2);
                break;
            case "-":
                setResult(this.operand1 - this.operand2);
                break;
            case "*":
                setResult(this.operand1 * this.operand2);
                break;
            case "/":
                if (this.operand1 > this.operand2) {
                    setResult(this.operand1 / this.operand2);
                } else {
                    setResult(0);
                }
        }
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}
