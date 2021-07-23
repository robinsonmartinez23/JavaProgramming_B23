package day14_Recap;

import java.util.Scanner;

public class GradeLevel2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number: ");
        byte number = scan.nextByte();
        String gradeLevel = "";

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gradeLevel = "Elementary school";
                break;
            case 6:
            case 7:
            case 8:
                gradeLevel = "Middle School";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                gradeLevel = "Hgh School";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                gradeLevel = "College";
                break;
            case 17:
            case 18:
                gradeLevel = "Grad School";
                break;
            default:
                gradeLevel = "invalid";
        }

        System.out.println("gradeLevel = " + gradeLevel);

    }
}
/*
 Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
 */