
package savigsaccount;

public class SavigsAccount {
  
  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavigsAccount(String owner, int balanceDollar){
  
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar*0.85;
  }

  public void addMoney(int balanceDollar){
    
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    this.balanceEuro= this.balanceDollar * 0.85;
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }


  public static void main(String[] args) {
    SavigsAccount zeusSavigsAccount = new SavigsAccount("Zeus", 1000);

    // Hacer una llamada a addMoney() para probar el método
    zeusSavigsAccount.addMoney(2000);

    // Imprime el balance en euros después de agregar dinero
    System.out.println("Balance in euros: " + zeusSavigsAccount.balanceEuro);
  }
}
    