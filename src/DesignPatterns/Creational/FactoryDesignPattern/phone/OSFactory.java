package DesignPatterns.Creational.FactoryDesignPattern.phone;

import DesignPatterns.Creational.FactoryDesignPattern.OS;

public class OSFactory {
    public OS getInstance(String s) {
        switch (s.toLowerCase()) {
            case "open":
                return new Android();
            case "old":
                return new Symbian();
            case "secure":
                return new IOS();
            default:
                return new Windows();
        }
    }
}
