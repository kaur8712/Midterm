/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/** Improve the code by applying suitable design principles
 * date: June 24
 * @author Sivagama
 */
public class Account {

    
        public double balance;
        public double interestRate=0.3;
        public String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
     * @param givenUser 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //To create an account the initial balance must be greater than 50.       
        }
        public double getBalance(double balance)
        {
        return balance*0.3;
        }
        public double setBalance(double balance)
        {
        this.balance = balance ;
            return balance;
        }
     /**The method for depositing amount and 
      * updating balance
     * @param amount*/
        public void credit(double amount)
        {
            balance=balance+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance
     * @param amount */
        public void debit(double amount)
        {
            balance=balance-amount;

        } 
    
}//class end
