package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparator {
    public static void main(String args[]) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ram",23));
        list.add(new Employee("John",43));
        list.add(new Employee("Crish",32));
        list.add(new Employee("Tom",44));
        Collections.sort(list,new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for(Employee e:list){
            System.out.println(e);
        }

    }
}

class MySalaryComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getAge() < e2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}

class Employee {
    private String fullName;
    private int age;

    public Employee(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.fullName + "-- Age: " + this.age;
    }

}

