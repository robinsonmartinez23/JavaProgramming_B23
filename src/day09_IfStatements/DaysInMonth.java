package day09_IfStatements;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 10;
        boolean has28days = month == 2;
        boolean has30days = month == 4 || month == 6 || month == 9 ||month == 11;
        boolean has31Days = !has28days && !has30days;

        if (has28days)
            System.out.println("28 days");
        if (has30days)
            System.out.println("30 days");
        if (has31Days){
            System.out.println("31 days");
        }


    }
}
