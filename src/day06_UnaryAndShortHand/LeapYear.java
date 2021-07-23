package day06_UnaryAndShortHand;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isleapyear = year%4 == 0;
            //if the yar is evenly divisible by 4, then it is leap year
        System.out.println(year+" is leap year: "+ isleapyear);
        }
}
