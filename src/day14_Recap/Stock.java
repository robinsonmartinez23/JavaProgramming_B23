package day14_Recap;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many total shares they have already?");
        int totalShares = scan.nextInt();
        if (totalShares >0){
            System.out.println("How much is your total value in the stock market?");
            double totalValue = scan.nextDouble();

            scan.nextLine();
            System.out.println("Enter the name of the company");
            String companyName = scan.nextLine();
            scan.close();
            System.out.println("Your total stock market is $"+totalValue+" which is made up of "+totalShares+" shares");
            System.out.println(companyName+" is your company holding");
        }else{
            System.out.println("Invalid number");
        }
    }
}
/*
2. Stock
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed
        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
        - Print in the following format:
            Ex:
                inputs: 100, 25000.5, Apple INC
            "Your total stock market holding is $25000.5 which is made up of 100 shares. Apple INC is your company holdings"
 */