import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 5 && word.length()%2 == 1){
            int length = word.length();
            String middle = word.substring(length/2-1, length/2+2);
            System.out.println(middle);
        }else{
            System.out.println("invalid");
        }

    }
}
