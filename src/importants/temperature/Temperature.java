package importants.temperature;

import DesignPatterns.Creational.prototypeDesignPattern.Book;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {

    private double defaultTemp=0.0;
    private Location location;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    DecimalFormat numberFormat = new DecimalFormat("#.00");


    public double Temperature(double defaultTemp) {
        return this.defaultTemp=defaultTemp;
    }

    private String getTempInFarenheit(double celcius) {
        return (this.numberFormat.format((double)(9/5)*(celcius+32.0)));
    }

    private String getTempInCelcius(double farenheit) {
        return (this.numberFormat.format((double)5/9*(farenheit-32.0)));
    }

    private double getCurrentTemp() {
        return defaultTemp;
    }

    private double setDefaultTemp(double defaultCelcius){
        return this.defaultTemp = defaultCelcius;
    }

    public static void main(String[] args) {

        Temperature temp = new Temperature();
        Boolean flag = true;

        while(flag){
            System.out.println();
            System.out.println("Current Default temperatures: "+temp.getCurrentTemp()+"C OR "+temp.getTempInFarenheit(temp.getCurrentTemp())+"F");
            System.out.println();

            System.out.println("1.Convert Celcius to Fareiheit");
            System.out.println("2.Convert Fareiheit to Celcius");
            System.out.println("3.Update default temperature");
            System.out.println("4.Update default Location");
            System.out.println("5.Exit");

            Scanner sc = new Scanner(System.in);
            int input =  0;
            if(sc.hasNextInt()) {
                input = sc.nextInt();
            }

            switch (input) {
                case 1: System.out.println("Enter temperature in Celcius to convert into Farenheit");
                    double celcius = sc.nextDouble();
                    System.out.println(celcius+"C = "+temp.getTempInFarenheit(celcius)+"F");
                    break;
                case 2: System.out.println("Enter temperature in Farenheit to convert into Celcius");
                    double fareinheit = sc.nextDouble();
                    System.out.println(fareinheit+"F = "+temp.getTempInCelcius(fareinheit)+"C");
                    break;
                case 3: System.out.println("Enter temperature in celcius");
                    System.out.println("Default Temperature Set to:" + temp.setDefaultTemp(sc.nextDouble())+ " C");
                    break;
                case 4: System.out.println("Select Location");
                    System.out.println("1. Armpit");
                    System.out.println("2.Ear");
                    System.out.println("3.Mouth");
                    int location = sc.nextInt();
                    Location c1 = Location.Armpit;
                    switch (location) {
                        case 1:  c1 = Location.Armpit;
                        break;
                        case 2: c1 = Location.Ear;
                        break;
                        case 3: c1 = Location.Mouth;
                        break;
                        default: System.out.println("Invalid.. Assuming Armpit");
                    }
                    System.out.println("Location of measurement: " + c1);
                    break;
                case 5: System.out.println("Exiting system");
                    flag = false;
                    break;
                case 0:
                    System.out.println("Invalid input.");;
            }
        }
    }
}

