package com.db.SpringBoot.SpringBootPractice.Model;

public class CacheCustomer {

    private int accountno;
    private String customername;
    private String accounttype;
    private double balance;

    public CacheCustomer(int accountno, String customername, String accounttype, double balance){
        this.accountno=accountno;
        this.customername=customername;
        this.accounttype=accounttype;
        this.balance=balance;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
