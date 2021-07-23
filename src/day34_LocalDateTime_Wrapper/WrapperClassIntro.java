package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s = 10;
        int num = s;
        Integer num2 = (int) s; //Autoboxing: converting primitive value to wrapper class value
                                // Es necesario hacer el casting para representar s como int ya que
                                // originalmente es short
        char ch = '@';
        Character ch2 =  ch; // Autoboxing
                             // En el background lo que java hace es (Character) ch

        Byte b1 = 10;

        byte b2 = b1;  // unboxing
        short b3 = b1;  // unboxing
        int b4 = b1; // unboxing
        long b5 = b1; // unboxing
        float b6 = b1; // unboxing
        double b7 = b1; // unboxing

        System.out.println("------------------------------------------------");

        byte c1 = 10;

        Byte c2 = c1; // Autoboxing, wrapper classes oly accept its own primitive
        //  Short c3 = c1; //Short wrapper class only accepts short primitive
        //  Integer c4 = c1; //Integer wrapper class only accepts int primitive
        //  Long c5 = c1; //Long wrapper class only accepts long primitive
        // Float c6 = c1;
        //  Double c7 = c1;
    }
}
