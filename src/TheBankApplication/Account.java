package TheBankApplication;

import javax.xml.bind.annotation.XmlElement;

public class Account {
    private int accountNumber;
    private String pin;
    private double availableBalance;
    private double totalBalance;
    
    public Account() {  }
    public Account(int theAccountNumber, String thePIN,
            double theAvailableBalance, double theTotalBalance){
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }
    ////////////////////////////////////////////////////////////
    
    @XmlElement
    public int getAccountNumber() {
        return accountNumber;
    }
    @XmlElement
    public String getPin() {
        return pin;
    }
    @XmlElement
    public double getAvailableBalance() {
        return availableBalance;
    }
    @XmlElement
    public double getTotalBalance() {
        return totalBalance;
    }
    
    
    public boolean validatePIN(String userPIN){
        return (userPIN == null ? pin == null : userPIN.equals(pin));
    }
    public void credit(double amount){
        totalBalance += amount;
    }
    public void debit(double amount){
        availableBalance -= amount;
        totalBalance -= amount;
    }

    @Override
    public String toString() {
        return "Account Number: "+this.accountNumber+" Pin: "+this.pin; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
