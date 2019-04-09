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
public class checkingAccount extends Account{

    public checkingAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }
    
    
    @Override
    public void withdraw(double amount){
        if(balance >= amount + 4.2){
            balance -= (amount + 4.2);
        }
    }
}
