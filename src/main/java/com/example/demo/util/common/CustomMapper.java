package com.example.demo.util.common;

public class CustomMapper {

    private int key;
    private int value;
    private int result;

    public CustomMapper(int key, int value, String symbol) {
        this.key = key;
        this.value = value;
        this.result = getResult(symbol);
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public int getResult(String symbol) {
        switch(symbol){
            case "+":
                setResult(this.key + this.value);
                break;
            case "-":
                setResult(this.key - this.value);
                break;
            case "*":
                setResult(this.key * this.value);
                break;
            case "/":
                if (this.key > this.value){
                    setResult(this.key / this.value);
                }else{
                    setResult(0);
                }
        }
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
