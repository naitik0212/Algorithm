package DesignPatterns.Creational.FactoryDesignPattern.phone;

import DesignPatterns.Creational.FactoryDesignPattern.OS;

public class Android implements OS {
    public void spec(){
        System.out.println("Android is open source OS and is very powerful, supports a lot of Mobile phones");
    }
}
