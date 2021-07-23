import java.util.Scanner;

public class MikeTyson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String emailString = ""+email;
        if (!emailString.contains("_")){
            System.out.println(emailString);
        }else{

        }
    }

}
