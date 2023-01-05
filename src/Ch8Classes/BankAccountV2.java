package Ch8Classes;

/**
 * Template for simple checking account
 * @author Senastian Lassander
 * @since Friday, Nov. 4, 2022
 * @version
 */
public class BankAccountV2 {
    //fields (instance variables)

    private String name, ss, phone, email;
    private Address address;
    private DOB dob;
    private double balance;
    private static int pin,accountNumber;
    private static int totalNumberOfAccounts;
    //constructor(s)

    //in-person account
    public BankAccountV2 (String name, String ss, Address address, DOB dob, String phone, String email, int pin, double balance){
        totalNumberOfAccounts++;
        this.name = name;
        this.ss = ss;
        this.address = address;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.pin = pin;
        this.balance = balance;
        this.accountNumber = totalNumberOfAccounts;
    }
    public BankAccountV2 (String name, String ss, Address address, DOB dob, String phone, String email, int pin){
        this(name,ss,address,dob,phone,email,pin,0);
    }

    //getters (accesor - non-void methods)

    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    //setters (mutator - void methods)

    public void setAddress (Address address){
        this.address = address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    //toString
    public String toString(){
        return "Name: " + name + "\n" +
                "Address:" + address + "\n" +
                "Ending balance: " + balance + "\n" +
                "Date Of Birth: " + dob +
                "Thank you for being a valued customer!";

    }
}
