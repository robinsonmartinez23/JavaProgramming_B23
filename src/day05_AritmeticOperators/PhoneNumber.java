package day05_AritmeticOperators;

public class PhoneNumber {
    /*
    2. create a class named Phone Number and declare the followinh variables:
				countryCode, areaCode, localNumber
				use string concatenation to display the phone number

				ex:
					if  countryCode = +1
						areaCode = 703
						localNumber = 4512625
					output:
						+1(703)-4512625
     */
    public static void main(String[] args) {
        int countryCode = 1,
                areaCode = 703,
                localNumber = 4512625;
        System.out.println("+"+countryCode+"("+areaCode+")-"+localNumber);

    }
}
