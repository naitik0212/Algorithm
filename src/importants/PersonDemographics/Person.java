package importants.PersonDemographics;

public class Person {

    private String personName;
    private String gender;
    private int age;


    private Address address;

    public Person(String name, int age, Address address) {
        this.personName = name;
        this.age = age;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPatientName() {
        return personName;
    }

    public void setPatientName(String personName) {
        this.personName = personName;
    }

    public String getFullAddress() {
        return address.getCountry() + ", " + address.getState() + " - " +
                address.getFullAddress() + " and the phone number is " + address.getContactNo();
    }
}