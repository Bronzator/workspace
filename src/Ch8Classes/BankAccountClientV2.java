package Ch8Classes;

public class BankAccountClientV2 {

    public static void main(String[] args) {
        //Kai
        Address kaiaddress = new Address(123,"Main Street", "Mamaroneck","NY",10543);
        DOB kaidob = new DOB(06,11,15);
        BankAccountV2 kai = new BankAccountV2("Kai", "123456789", kaiaddress, kaidob, "123-456-7890", "kai@cs.com", 1337);
        kai.deposit(8000);


        //Rosemary
        Address rosemarryaddress = new Address(123,"Main Street", "Mamaroneck","NY",10543);
        DOB rosemarydob = new DOB(06,02,19);
        BankAccountV2 rosemary = new BankAccountV2("Rosemary", "123456789", rosemarryaddress, rosemarydob, "123-456-7890", "rosemary@cs.com", 3753);


        //Quinn
        Address quinnaddress = new Address(123,"Main Street", "Mamaroneck","NY",10543);
        DOB quinndob = new DOB(05,12,03);
        BankAccountV2 quinn = new BankAccountV2("Quinn", "123456789", quinnaddress, quinndob, "123-456-7890", "rosemary@cs.com", 3753);

        BankAccountV2 [] arr = {kai,quinn,rosemary};

        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + "\n");
        }
    }
}
