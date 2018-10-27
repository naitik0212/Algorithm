package Collections.HashTable;

import java.util.Hashtable;
import java.util.Set;

public class HashTableUserKeys {
    public static void main(String a[]){
        Hashtable<Employee,String> tm = new Hashtable<Employee, String>();
        tm.put(new Employee(134,"Ram",3000), "RAM");
        tm.put(new Employee(235,"John",6000), "JOHN");
        tm.put(new Employee(876,"Crish",2000), "CRISH");
        tm.put(new Employee(512,"Tom",2400), "TOM");
        System.out.println("Fecthing value by creating new key:");

        Employee e = new Employee(512,"Tom",2400);
        System.out.println(e+" ==> "+tm.get(e));

        System.out.println("Adding duplicate entry:");
        tm.put(new Employee(512,"Tom",2400), "TOM");
        System.out.println("Hashtable entries:");
        Set<Employee> keys = tm.keySet();
        for(Employee key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }
        System.out.println("Duplicate got eliminated!!!");
    }
}


class Employee {
    private String fullName;
    private int id;
    private int salary;

    public Employee( int id,String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getid() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setid(Integer age) {
        this.id = age;
    }

    public String toString() {
        return "Name: " + this.fullName + "-- Age: " + this.id;
    }

    @Override
    public int hashCode() {
//        System.out.println("In hashcode");
        return this.getid();
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = null;
        if(obj instanceof Employee){
            e = (Employee) obj;
        }
        System.out.println("In equals");
        assert e != null;
        return this.getid() == e.getid();
    }
}