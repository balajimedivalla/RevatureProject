package com.ciscointerview1.com;

public class ImplementationClass extends Lenovo {

    public ImplementationClass(String name, String address) {
        super(name, address);
    }

    @Override
    void copy() {
        System.out.println("We can implement the copy function");
    }

    @Override
    void paste() {
        System.out.println("We can implement the paste function");
    }

    public static void main(String[] args) {
        ImplementationClass s = new ImplementationClass("balaji", "bangalore");
        s.copy();
        s.paste();  // You can also test the paste method here
    }
}
