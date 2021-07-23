package basic;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

            do{
                System.out.println("Enter Item"+count+ " and its price:");
                item = scan.nextLine();
                price = scan.nextDouble();
                System.out.println("Add one more item?");
                countinue = scan.nextLine();
                count++;
            }while(count <= 10);
    }
}
