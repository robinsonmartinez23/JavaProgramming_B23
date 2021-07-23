package day09_IfStatements;

public class MaximumNumber2 {
    public static void main(String[] args) {
        int a = 30, b = 40;
        if (a > b) {
            System.out.println(a + " is the maximum");
        }else if (b > a){
            System.out.println(b + " is the maximum");
        }else{
            System.out.println("equal");
        }
    }
}
