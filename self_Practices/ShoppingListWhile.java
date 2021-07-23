import java.util.Scanner;

public class ShoppingListWhile {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String shoppingListReport = "";
            String item = "";
            String countinue = "";
            double price = 0;
            int count = 1;
            double totalPrice = 0;

            do {
                System.out.println("Enter Item" + count + " and its price:");
                count++;
                item = scan.nextLine();
                price = scan.nextDouble();
                System.out.println("Add one more item?");
                countinue = scan.next();
            } while (countinue == "yes");
        }
}
