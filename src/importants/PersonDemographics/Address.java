package importants.PersonDemographics;

public class Address {
    private String country;
    private String state;
    private String fullAddress;
    private String contactNo;

    public Address(String country, String state, String fullAddress, String contactNo) {
        this.country = country;
        this.state = state;
        this.fullAddress = fullAddress;
        this.contactNo = contactNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
