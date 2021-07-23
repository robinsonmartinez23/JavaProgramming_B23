package day07_ShortHand_Relational;

public class EligebleForLoan {
    public static void main(String[] args) {
        String name = "Randy";
        int age = 49;
        int creditScore = 760;
        int workHistory = 7;
        double income = 45000;

        boolean isElegible = age >= 18 && workHistory >= 2 && creditScore >= 700 && income >= 60000;
        //                  49>=18  true    7>=2   true        760>=700 true     45k >= 60k false
        System.out.println("isElegible = " + isElegible);

        /*
        EligibleForloan
        income has to be at least 60k
        at least 2 years of work history
        at least has 700 credit score
        at keast 60000 income

         */

    }
}
