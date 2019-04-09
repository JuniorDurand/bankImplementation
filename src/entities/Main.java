/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import java.util.Scanner;
/**
 *
 * @author durand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank banco = new Bank();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1 - Criar conta poupança");
            System.out.println("2 - Criar conta corrente");
            System.out.println("3 - Criar conta empresarial");
            System.out.println("4 - listar contas");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();
            if(opcao >=1 && opcao <=4){
                banco.addAccount( number, S holder,  balance,  loanLimit,  opcao);
            }
            
        }while(opcao != 5);
        
    }
    
}
