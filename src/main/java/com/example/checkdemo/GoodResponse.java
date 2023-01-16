package com.example.checkdemo;

public class GoodResponse {
    private int id;
    private String name;

    public GoodResponse(Good good) {
        this.id = good.getId();
        this.name = good.getName();
    }
}
