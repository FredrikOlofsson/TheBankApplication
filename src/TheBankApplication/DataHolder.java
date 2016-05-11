package TheBankApplication;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataHolder {
    private ArrayList<Account> databaseAccounts;
    
    public DataHolder() {
        databaseAccounts = new ArrayList<>();    
    }
    ///////////////////
    @XmlElement
    public ArrayList<Account> getList() {
        return this.databaseAccounts;
    } 
    public Account getAccount (int accountNumber){
        for(Account currentAccount : databaseAccounts){
            if(currentAccount.getAccountNumber() == accountNumber){
                return currentAccount;
            }
        }
        return null; //TODO Change to throw exception!
    }
    public void addList(ArrayList<Account> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
    }
    public void addAccount(Account newAccount) {
        this.databaseAccounts.add(newAccount);
    }
    public double getAvailableBalance(int userAccountNumber){
        return getAccount(userAccountNumber).getAvailableBalance();
    }
    public double getTotalBalance(int userAccountNumber){
        return getAccount(userAccountNumber).getTotalBalance();
    }
    ///////////////////
    
    public void printAccountsInfo() {
        System.out.println("Accounts : " + databaseAccounts.size());
        for (Account i : databaseAccounts){
            System.out.println(i.toString());
        }
    } 
    public boolean authenticateUser(int userAccountNumber, String userPIN){
        Account userAccount = getAccount(userAccountNumber);
        if(userAccount != null){
            return userAccount.validatePIN(userPIN);
        } else return false;
    }
    public void credit(int userAccountNumber, double amount){
        getAccount(userAccountNumber).credit(amount);
    }
    public void debit(int userAccountNumber, double amount){
        getAccount(userAccountNumber).debit(amount);
    }    
   

    @Override
    public String toString() {
        return "AccountsArray : " + "databaseAccounts :\n" + databaseAccounts;
    }
 
}
