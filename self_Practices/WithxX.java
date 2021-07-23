import java.util.Scanner;

public class WithxX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.charAt(0) == 'x'|| word.charAt(0) =='X'){
            String newWord = word.replace("x","");
         //   newWord = nword.replace("X","");
            System.out.println(newWord);
        }else{
            System.out.println(word);
        }
    }
}
