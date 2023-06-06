package com.example.demo.util.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CustomMapper {

    @SerializedName("id")
    private int id;

    @SerializedName("operand1")
    private int operand1;

    @SerializedName("operand2")
    private int operand2;

    @SerializedName("result")
    private int result;

    public CustomMapper(){}

    public CustomMapper(int id, int key, int value, String symbol) {
        this.id = id;
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

    public String toJson(List<CustomMapper> customMapperList) {
        Gson gson = new Gson();
        return gson.toJson(customMapperList);
    }
}
