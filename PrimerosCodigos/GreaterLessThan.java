package greaterlessthan;

public class GreaterLessThan {

    public static void main(String[] args) {
        
        double creditsEarned  = 176.5;
        double creditsOfSeminar  = 8;
        double creditsTograduate  = 180;
        double creditsAfterSeminar  = creditsEarned + creditsOfSeminar;
        
        System.out.println(creditsEarned > creditsTograduate);
        System.out.println(creditsTograduate < creditsAfterSeminar);
        
        
    }
    
}
