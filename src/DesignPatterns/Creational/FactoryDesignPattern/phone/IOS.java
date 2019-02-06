package DesignPatterns.Creational.FactoryDesignPattern.phone;

import DesignPatterns.Creational.FactoryDesignPattern.OS;

public class IOS implements OS {
    public void spec(){
        System.out.println("IOS is closed and secure OS, very fast, supports all the Apple devices");
    }
}
