package day10_IfStatements;

public class CampusHours {
    public static void main(String[] args) {
        int hour = 24;
        String result = "";
        if (hour >= 11 && hour <= 23){
            result = "open";
        }else{
            result = "close";
        }
        System.out.println("result = " + result);
    }
}
