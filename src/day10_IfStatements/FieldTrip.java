package day10_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 6;

        String location = "";
        int group = 0;
        String teacher = "";

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard"; group = 3; teacher = "Ms.Smith";
            } else if (grade == 2) {
                location = "Zoo"; group = 7; teacher = "Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium"; group = 5; teacher = "Ms.Wilson";
            } else if (grade == 4) {
                location = "Movie theater"; group = 2; teacher = "Ms.Reyes";
            } else if (grade == 5) {
                location = "Museum"; group = 5; teacher = "Ms.Lela";
            } else {
                location = "Six Flags"; group = 8; teacher = "Mr.Watt";
            }
        }else {
            location = "Unknown"; teacher = "Unknown";
        }
        System.out.println("grade = " + grade);
        System.out.println("group = " + group);
        System.out.println("location = " + location);
        System.out.println("teacher = " + teacher);
    }
}
