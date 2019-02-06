package DesignPatterns.Creational.FactoryDesignPattern.phone;

import DesignPatterns.Creational.FactoryDesignPattern.OS;

public class Windows implements OS {
    public void spec(){
        System.out.println("Windows is a good OS, but used less now a days");
    }
}
