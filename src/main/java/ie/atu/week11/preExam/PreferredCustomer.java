package ie.atu.week11.preExam;

public class PreferredCustomer extends Customer{
    private double purchaseHistory;
    private double discount;

    public PreferredCustomer() {
    }

    public PreferredCustomer(String name, String address, String phoneNum, String customerNum, Boolean mailingList, double purchaseHistory) {
        super(name, address, phoneNum, customerNum, mailingList);
        this.purchaseHistory = purchaseHistory;
        if(purchaseHistory >= 2000) {
            discount = 0.1;
        } else if(purchaseHistory >= 1500) {
            discount = 0.07;
        } else if(purchaseHistory >= 1000) {
            discount = 0.06;
        }else if(purchaseHistory >= 500) {
            discount = 0.05;
        }
    }

    public double getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(double purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
        if(purchaseHistory >= 2000) {
            discount = 0.1;
        } else if(purchaseHistory >= 1500) {
            discount = 0.07;
        } else if(purchaseHistory >= 1000) {
            discount = 0.06;
        }else if(purchaseHistory >= 500) {
            discount = 0.05;
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount >= 2000) {
            discount = 0.1;
        } else if(discount >= 1500) {
            discount = 0.07;
        } else if(discount >= 1000) {
            discount = 0.06;
        }else if(discount >= 500) {
            discount = 0.05;
        }
        //this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + ", PurchaseHistory: €" + purchaseHistory + ", Discount: €" + discount + "}";
    }
}
