package day08_IfStatements;

public class LogialOperators {
    public static void main(String[] args) {
        System.out.println(!true);//false
        System.out.println(!false);//true

        System.out.println(true == !false);
        //                 true == true
        System.out.println(true != !true);
        //                 true != false

        System.out.println("-------------------------");

        int score = 59;
        boolean passed = score >= 60;
        // boolean failed = score < 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("-------------------------");

        int age = 20;
        boolean eligible = age >= 21;
        boolean noEligible = !eligible;

        System.out.println("eligible = " + eligible);
        System.out.println("noEligible = " + noEligible);

    }
}
