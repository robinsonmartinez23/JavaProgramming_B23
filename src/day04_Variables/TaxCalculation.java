package day04_Variables;

public class TaxCalculation {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;

        System.out.println("Your salaryis "+salary);

        //You need to pay totalStateTax to state tax
        System.out.println("You need to pay $"+ totalStateTax +" of state tax");

        //You need to pay totalFederalTax to federal tax
        System.out.println("You need to pay $"+ totalFederalTax +" of Federal tax");

    }
}
