package DesignPatterns.Structural.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface  Component{
    public void showPrice();
}


class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public void showPrice(){
        System.out.println("Name " + name + ": Price : " + price);
    }
}


class Composite implements Component {
    List<Component> components = new ArrayList<>();
    String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    public void showPrice(){
        System.out.println("Name : " +name);
        System.out.println("Child Connnectors: " );


        for(Component c: components) {
            c.showPrice();
        }
    }
}