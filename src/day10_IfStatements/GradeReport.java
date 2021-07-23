package day10_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 59; // A,B,C,DF
        String grade = "";
        if (score >=0 && score<=100){
            if(score>=90){
                grade = "A";
            }else if(score>=80){
                grade = "B";
            }else if(score>=70){
                grade = "C";
            }else if(score>=60){
                grade = "D";
            }else{
                grade = "F";
            }

        }else{
            grade = "invalid";
        }
        System.out.println("grade = " + grade);
    }
}
