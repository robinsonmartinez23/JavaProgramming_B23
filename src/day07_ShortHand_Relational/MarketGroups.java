package day07_ShortHand_Relational;

public class MarketGroups {
    public static void main(String[] args) {
        int score = 22;
        boolean earlyBird = score >=50;
        boolean group1 = score >=40 && score <=49;
        boolean group2 = score >=30 && score <=39;
        boolean angryBird = score < 30;

        System.out.println("earlyBird = "+earlyBird);
        System.out.println("group1 = "+group1);
        System.out.println("group2 = "+group2);
        System.out.println("angryBird = "+angryBird);


        /*
        earlyBirds: 50-60
        group1: 40-49
        group2: 30-39
        angryBird: <30
         */


    }
}
