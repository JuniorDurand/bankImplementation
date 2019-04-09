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
public class BusinessAccount extends Account{
    protected Double loanLimit;

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            this.deposit(amount);
        }
    }
    
    @Override
    public void withdraw(double amount){
        if(balance >= amount + 7.5){ //7.5 taxa de saque.
            balance -= (amount - 7.5);
        }
    }
    
}
