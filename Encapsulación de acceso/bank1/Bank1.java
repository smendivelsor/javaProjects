package bank1;

 public class Bank1 {
    private  CheckingAccount accountOne;
    private  CheckingAccount accountTwo;

 public Bank1(){
    accountOne = new CheckingAccount("Zeus",100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
}    
  
  public static void main(String[]args){
    Bank1 bankOfGods= new Bank1();
    System.out.println(bankOfGods.accountOne.name);
    bankOfGods.accountOne.addFunds(5);
    bankOfGods.accountOne.getInfo();
  }
 }
    