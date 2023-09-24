package greaterthanequalto;

public class GreaterthanEqualto {

    public static void main(String[] args) {
      
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      double totalrecommendedAmount = recommendedWaterIntake*daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalrecommendedAmount;
      System.out.println(isChallengeComplete);
    }
    
}
