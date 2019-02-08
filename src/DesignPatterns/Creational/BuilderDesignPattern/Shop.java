package DesignPatterns.Creational.BuilderDesignPattern;

public class Shop {

    public static void main(String args[]) {
    Phone p = new PhoneBuilder().setOs("IOS").setProcessor("Quallcomm").getPhone();
    System.out.println(p);
    }


}
