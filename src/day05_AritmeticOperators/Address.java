package day05_AritmeticOperators;

public class Address {
    /*
    1. create a class named Address and declare the following variables:
			name, buildingNumber, streetName, city, state, zipCode

			use string concatenation to display the full address of the person

			Ex:
				Daniel Owens
				7925 Jones Branch Dr
				McLean VA 22102
     */
    public static void main(String[] args) {
        String name = ("Robinson Martinez "),
                buildingNumber = ("7340"),
                streetName = ("Harding Ave"),
                city = ("Miami Beach"),
                state = ("FL"),
                zipCode = ("33141");
        System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+" "+state+", "+zipCode);
    }
}
