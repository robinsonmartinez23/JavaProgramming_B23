package basic;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();

        if (item.contains("Blanket")|| item.contains("Charger")||
                item.contains("Hat")|| item.contains("Headphones")||
                item.contains("Laptop")|| item.contains("Pants")||
                item.contains("Pillow")|| item.contains("Smartphone")||
                item.contains("Socks")|| item.contains("USB cable")){
            if (item.contains("Blanket")){
                int itemValue = 60;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+balance+"$");
            }else if(item.contains("Charger")){
                int itemValue = 15;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+balance+"$");
            }else if(item.contains("Hat")) {
                int itemValue = 25;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if(item.contains("Headphones")) {
                int itemValue = 30;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if(item.contains("Laptop")) {
                int itemValue = 200;
                int balance = (100 - itemValue);
                System.out.println("Sorry, not enough funds on your gift card");
            }else if(item.contains("Pants")) {
                int itemValue = 50;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if(item.contains("Pillow")) {
                int itemValue = 40;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if(item.contains("Smartphone")) {
                int itemValue = 1000;
                int balance = (100 - itemValue);
                System.out.println("Sorry, not enough funds on your gift card");
            }else if(item.contains("Socks")) {
                int itemValue = 5;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else{
                int itemValue = 10;
                int balance = (100 - itemValue);
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }

        }else {
            System.out.println("Invalid item!");
        }
       scan.close();
    }
}
