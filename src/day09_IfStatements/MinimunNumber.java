package day09_IfStatements;

public class MinimunNumber {
    public static void main(String[] args) {
        int num1 = 40, num2 = 30;
        if (num1 < num2) {
            System.out.println(num1 + " is minimum");
        }
        if (num2 < num1) {
            System.out.println(num2 + " is minimum");
        }
        System.out.println("---------------------------------------------------");

        if(num1 < num2){
            System.out.println(num1+" is minimum");
        }else{
            System.out.println(num2+" is minimum");
        }

    }
}
