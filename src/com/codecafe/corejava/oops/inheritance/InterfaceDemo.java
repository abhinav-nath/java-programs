package com.codecafe.corejava.oops.inheritance;

public class InterfaceDemo {

    public static void main(String[] args) {

        IParent parent = new Child();

        parent.foo();

        // parent.bar(); compilation error : The method bar() is undefined for the type IParent

        ((Child) parent).bar();

    }

}