package TheBankApplication;

import java.util.ArrayList;
import java.util.Random;

public class UserGenerator {
    private ArrayList<Account> list;
    private Random random;
    
    private String PIN;
    private int randomAccountNumber;
    private int randomBalance;
    private int randomTotalBalance;
    
    public UserGenerator() {
        list = new ArrayList<>();   
        this.random = new Random();
    }
    /////////////
    public ArrayList<Account> getList() {
        return list;
    }
    /////////////
    public void generateList(int amount){
        for(int i=0; i<amount; i++){
            list.add(generateUser());
        }
    }
    public Account generateUser(){
        this.randomAccountNumber = random.nextInt(100000)+10000;
        this.PIN = "password";
        this.randomBalance = random.nextInt(1000)+100;
        this.randomTotalBalance = (this.randomBalance)*2;
        Account tempAcc = new Account(randomAccountNumber,PIN,
                randomBalance,randomTotalBalance);
        return tempAcc;
    }
    public void printAccountsInfo() {
        System.out.println("Accounts : " + list.size());
        for (Account i : list){
            System.out.println(i.toString());
        }
    } 
    
}
