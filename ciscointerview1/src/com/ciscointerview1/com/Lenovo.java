package com.ciscointerview1.com;

public abstract class Lenovo {
    String name;
    String adress;

    public Lenovo(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    abstract void copy();

    abstract void paste();
}
