/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import java.util.ArrayList;
/**
 *
 * @author durand
 */
public class Bank {
    ArrayList <Account> bank;

    public Bank(){
	this.bank = new ArrayList<>();
    }

    public void  addAccount(int number, String holder, double balance, double loanLimit, int option){
	if(option == 1){
            bank.add( new savingsAccount( number,  holder,  balance));
        }else if(option == 2){
            bank.add( new checkingAccount( number, holder, balance));
        }else if(option == 3){
            bank.add( new BusinessAccount(loanLimit, number, holder, balance));
        }
    }
        
    public void listAccounts(){
        for( Account x : bank){
            System.out.println( x.getNumber() +", "+ x.getHolder() +", $:" + x.getBalance());
        }
    }
        

	

}
