package day28_Metods;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
public class VoidMethodsPractice {
    public static void main(String[] args) {
        printOddNumber(0,100);
        printEvenNumber(0,100);
        ageOfAPerson(1979);
        eligibleToVote(22,true);
        calculate(20,'*', 3);
    }

    public static void printOddNumber(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printEvenNumber(int from, int to){
        for (int i = from; i <= to ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void ageOfAPerson(int yearOfBirth){
        //int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = (2021 - yearOfBirth);
        System.out.println("Your day of birth is: "+age);
    }
    public static void eligibleToVote (int age, boolean isUSCitizen){
        if(age >= 21 && isUSCitizen){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void calculate(int num1, char operator, int num2){
        switch(operator){
            case '-':
                System.out.println("Subtraction: "+(num1-num2) );
                break;
            case '+':
                System.out.println("Addition: "+(num1+num2) );
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2) );
                break;
            case '/':
                System.out.println("Division: "+(num1/num2) );
                break;
            default:
                System.out.println("Invalid arguments");
        }
    }
}
