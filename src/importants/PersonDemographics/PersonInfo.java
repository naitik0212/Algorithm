package importants.PersonDemographics;

public class PersonInfo {

    public static void main(String args[]) {
        Address a1 = new Address("USA", "CA", "Los Angeles", "213-833-2121");
        Person p1 = new Person("Heidi", 22, a1);

        System.out.println(p1.getPersonName());
        System.out.println(p1.getAddress().getCountry());
        System.out.println(p1.getAge());
        p1.setGender("Female");
        System.out.println(p1.getGender());

    }

}
