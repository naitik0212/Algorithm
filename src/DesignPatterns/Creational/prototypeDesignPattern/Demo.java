package DesignPatterns.Creational.prototypeDesignPattern;

public class Demo {
    public static void main(String args[]) throws CloneNotSupportedException{
        BookShop bs = new BookShop();

        bs.setShopName("A1 Book Store");

        bs.loadData();

        BookShop bs1 =  bs.clone();
        bs.getBooks().remove(2);
        System.out.println(bs);

        bs1.setShopName("A2 Book Store");
        System.out.println(bs1);

    }
}
