package day04_Variables;

public class CarShop {
    public static void main(String[] args) {
        String brand = "Toyota",
               model = "Camrry",
               color = "White";
        int year = 2015,
            miles = 45000;

        double price = 25000;

    // 2015 Toyata Camry, White, 45000, $25000
        System.out.println(year+" "+brand+" "+model+", "+color+", "+miles+", $"+price+".");

    }
}
