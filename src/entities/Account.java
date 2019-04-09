/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author durand
 */
public class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        if(balance > 0){
            this.balance = balance;
        }else{
            this.balance = 0.0;
        }
    }

    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    
}
