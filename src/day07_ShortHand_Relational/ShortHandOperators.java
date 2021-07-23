package day07_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {
        String name1 = "Robison";
        String name2 = "Amanda";
        
        String name3 = name2;
        
        name2 = name1;
        name1 = name3;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("---------------------------");

        int balance = 300;
        balance += 1200;
        System.out.println("balance = " + balance);

        System.out.println("---------------------------");

        String mame = "Robinson";
        String lastName = "Martiez";
        //
        System.out.println("Full mame = " + mame);


        System.out.println("---------------------------");

        balance -= 300;
        System.out.println("balance = " + balance);

        System.out.println("---------------------------");

        //*=
        double salary = 1000;


        System.out.println("---------------------------");
        // /=
        double slices = 10;
        slices /= 3;
        System.out.println("slices = " + slices);

        System.out.println("---------------------------");
        int cents = 105;
        int quarters = cents/25;
        cents %=25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);



    }
}
