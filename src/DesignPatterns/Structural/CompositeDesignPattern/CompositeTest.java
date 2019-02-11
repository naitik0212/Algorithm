package DesignPatterns.Structural.CompositeDesignPattern;

public class CompositeTest {

    public static void main (String args[]) {
        Component hdd = new Leaf(5000, "HardDisk");
        Component mouse = new Leaf(200, "mouse");
        Component monitor = new Leaf(4000, "monitor");
        Component ram = new Leaf(3000, "ram");
        Component cpu = new Leaf(8000, "cpu");

        Composite ph =  new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);



        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ram.showPrice();
        mb.showPrice();



    }
}
