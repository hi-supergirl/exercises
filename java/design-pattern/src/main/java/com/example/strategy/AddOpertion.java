package com.example.strategy;

public class AddOpertion implements Operation{
    @Override
    public int operate(int param1, int param2) {
        return param1 + param2;
    }
}
