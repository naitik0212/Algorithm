package DesignPatterns.Creational.FactoryDesignPattern.phone;

import DesignPatterns.Creational.FactoryDesignPattern.OS;

public class FactoryMain {
    public static void main(String args[]) {
        OSFactory factory = new OSFactory();
        OS obj = factory.getInstance("Open");
        obj.spec();
    }
}
