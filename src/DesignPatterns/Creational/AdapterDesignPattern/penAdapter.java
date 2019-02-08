package DesignPatterns.Creational.AdapterDesignPattern;

public class penAdapter implements Pen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
