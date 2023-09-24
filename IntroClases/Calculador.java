package calculador;

public class Calculador {
    public Calculador() {
        
    }
    public int add(int a, int b) {
       return a + b;
       }

    public int substract(int a, int b) {
       return a - b;
       } 

    public int multiply(int a, int b) {
       return a*b;
       }

    public double divide(int a, int b) {
       return a/b;
       }

    public int modulo(int a, int b) {
       return a%b;
       }

  public static void main(String[] args) {
    Calculador myCalculator = new Calculador(); 
    
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.substract(45,11));
    System.out.println(myCalculator.multiply(3,2));
        
        
        
        
    }
    
}
