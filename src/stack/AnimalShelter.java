package stack;

import java.util.LinkedList;

public class AnimalShelter {

    public static void main(String args[]) {

        AnimalQueue a = new AnimalQueue();
        a.enqueue(new Dog("d1"));
        a.enqueue(new Dog("d2"));
        a.enqueue(new Cat("c1"));
        a.enqueue(new Dog("d3"));
        a.enqueue(new Cat("c2"));

        Animal an = a.dequeueAny();
        System.out.println(an.name);

        an = a.dequeueCat();
        System.out.println(an.name);

        an = a.dequeueDog();
        System.out.println(an.name);
    }
}

    abstract class Animal {
        public int ranking;
        public String name;
        public Animal(String n) {
            name = n;
        }
    }


class AnimalQueue
{
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int rank = 0; // Counter acts as timestamp

    public AnimalQueue() {
    }

    public void enqueue(Animal a) {
        a.ranking = rank;
        rank++;
        if (a instanceof Dog) dogs.addLast((Dog) a);
        if (a instanceof Cat) cats.addLast((Cat) a);
    }

    public Animal dequeueAny() {
        Dog d = dogs.peek();
        Cat c = cats.peek();
        if(d.ranking < c.ranking)
            return dequeueCat();
        else return dequeueDog();
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }
}


class Dog extends Animal
{
    public Dog(String n) {
        super(n);
    }
}

class Cat extends Animal
{
    public Cat(String n) {
        super(n);
    }
}


//referenced from https://github.com/rjaviervega/java-exercises/blob/master/src/AnimalShelter.java