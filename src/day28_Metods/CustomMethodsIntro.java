package day28_Metods;

public class CustomMethodsIntro {
    public static void main(String[] args) {
        printHello5Times();
        System.out.println("Robinson");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();
    }

    public static void printHello5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
/*
step1: print hello 5 times (loop)
step2: print your name
step3: print hello 5 times (loop)
step4: print your school name
steo5: print hello 5 times (loop)
 */