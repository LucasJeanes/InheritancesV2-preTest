package ie.atu.week11.preExam;

public class Customer extends Person{
    private String customerNum;
    private Boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNum, String customerNum, Boolean mailingList) {
        super(name, address, phoneNum);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public Boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{ " + super.toString() + ", CustomerNum: " + customerNum + ", Mailing List: " + mailingList + "}";
    }
}
