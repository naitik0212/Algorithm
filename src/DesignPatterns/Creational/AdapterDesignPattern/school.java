package DesignPatterns.Creational.AdapterDesignPattern;

public class school {
    public static void main(String args[]) {
        penAdapter p = new penAdapter();

        AssignmentWork aw = new AssignmentWork();
        //PilotPen pp = new PilotPen();
        aw.setP(p);
        aw.writeAssignment("Lets finish off the assignment");

    }
}
