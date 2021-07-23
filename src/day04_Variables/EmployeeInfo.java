package day04_Variables;

public class EmployeeInfo {
    /*
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee

     */
    public static void main(String[] args) {
        String firstName = "Rob";
        String lastName = "Mar";
        String fullName = firstName+" "+ lastName;
        System.out.println("fullName = " + fullName);
        int age = 25;
        String companyName = "Microsoft";
        String gender = "Male";
        String jobTitle ="SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        double salary = 11000;

        // Arron King
        // Emplotee full name is Aaron King
        System.out.println("Employee' full name is:"+fullName);

        //Aaron King is Male
        System.out.println(fullName+" is "+gender);


        // fullName is age years old
        System.out.println(fullName+" is "+age+" years old");

        //fullName works at companyName
        System.out.println(fullName+" works at "+companyName);

        //fullName' job title is jobTitle
        System.out.println(fullName+"' job title is "+jobTitle);

        //fullName is full time isFullTime
        System.out.println(firstName+" is full time?: "+isFullTime);

        //fullNme is married isMarried
        System.out.println(firstName+" is married?: "+isMarried);

        //fullName' salary is salary
        System.out.println(fullName+"'salary is "+salary);


    }
}
