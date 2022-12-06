package ie.atu.week11.preExam;

public class ClientEntry {
    public static void main(String[] args) {
        Customer clientPart1 = new Customer("John", "Galway", "60606", "01", true);
        System.out.println(clientPart1);

        PreferredCustomer clientPart2 = new PreferredCustomer("David","Galway","5645645","02",true,1300);
        System.out.println(clientPart2);

        PreferredCustomer clientPart3 = new PreferredCustomer();
        clientPart3.setName("David");
        clientPart3.setAddress("Ballybrit");
        clientPart3.setPhoneNum("965423");
        clientPart3.setCustomerNum("02");
        clientPart3.setMailingList(false);
        clientPart3.setPurchaseHistory(2000);

        System.out.println("Name: " + clientPart3.getName());
        System.out.println("Address: " + clientPart3.getAddress());
        System.out.println("PhoneNum: " + clientPart3.getPhoneNum());
        System.out.println("CustomerNum: " + clientPart3.getCustomerNum());
        System.out.println("Mailing List: " + clientPart3.getMailingList());
        System.out.println("Purchase History: " + clientPart3.getPurchaseHistory());
        System.out.println("Discount: " + clientPart3.getDiscount());
    }
}
