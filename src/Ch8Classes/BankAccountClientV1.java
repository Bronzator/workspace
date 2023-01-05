package Ch8Classes;

public class BankAccountClientV1 {

    public static void main(String[] args) {
        //Kai
        Address kaiaddress = new Address(123,"Main Street", "Mamaroneck","NY",10543);
        DOB kaidob = new DOB(06,11,15);
        BankAccountV2 kai = new BankAccountV2("Kai", "123456789", kaiaddress, kaidob, "123-456-7890", "kai@cs.com", 1337);
        kai.deposit(8080);
        System.out.println(kai + "\n");

        //Rosemary
        //BankAccountV2 rosemary = new BankAccountV2("Rosemary", "123456789", "123 Main Street", "06232005", "123-456-7890", "rosemary@cs.com", 3753);
        //System.out.println(rosemary + "\n");
        //Quinn
    }
}
