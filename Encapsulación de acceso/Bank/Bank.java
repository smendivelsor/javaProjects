
package bank;

public class Bank{
 private final CheckingAccount accountOne;
 private final CheckingAccount accountTwo;

 public Bank(){
 accountOne = new 
 CheckingAccount("Zeus",100);
 accountTwo = new 
 CheckingAccount("Hades",200);
 }

 public static void main(String[]args){
  Bank bankOfGods= new Bank();
  System.out.println(bankOfGods.accountOne.name);
  System.out.println(bankOfGods.accountOne.balance);
  }
 }

