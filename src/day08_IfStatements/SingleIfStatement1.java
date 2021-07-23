package day08_IfStatements;

public class SingleIfStatement1 {
    public static void main(String[] args) {
        int score = 60;
        String name = "Robinson";
        boolean passed = score >= 60;
        if (passed) {
            System.out.println("Congrats "+name+" you passed the exam");
        }
        if(!passed){
            System.out.println("Sorry "+name+ " you failed the exam");
        }
    }
}
