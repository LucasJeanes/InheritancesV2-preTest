package ie.atu.week11.preExam;

public class Person {
    private String name;
    private String address;
    private String phoneNum;

    public Person() {
    }

    public Person(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone#: " + phoneNum;
    }
}
