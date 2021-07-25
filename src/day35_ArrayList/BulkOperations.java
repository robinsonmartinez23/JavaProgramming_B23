package day35_ArrayList;

import day30_Recap.ArraysReview;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9) );

        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,1,2,3,4,5,6,7,8,9); MUST be passed as LIST then we use asList
        list.addAll( numbers ); // numbers is a collection then we can pass it directly
        list.addAll(  Arrays.asList( 10, 11, 12, 13, 14,15 )  );

        System.out.println(list);

        System.out.println("------------------------------------------------");

        ArrayList<String>  students = new ArrayList<>();
        students.addAll(  Arrays.asList( "Dilem", "Fhilipp", "Abbos", "Abbos", "Abbos", "Atila", "Ekaterina", "Dilem", "Fhilipp" , "Fhilipp") );

        System.out.println(students);

        students.removeAll(  Arrays.asList("Dilem", "Fhilipp", "Abbos")  );

        System.out.println(students);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,3,4,5,6,7,8,9,1,1,1,1,1,1,1,1,1,1,1,1) );
        System.out.println(nums);

        nums.removeAll(  Arrays.asList( 1 ) ); // removes all elements that are matching with 1
        //nums.retainAll( Arrays.asList(1,2) ); // removes all the elements that are not matching with 1 and 2
        System.out.println(nums);

        System.out.println("------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll( Arrays.asList(  "Dilem", "Fhilipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila" ));

        System.out.println(employees);

        //  employees.removeAll( Arrays.asList("Ahmet", "Andrei"));
        employees.retainAll( Arrays.asList("Ahmet", "Andrei"));
        System.out.println(employees);


        System.out.println("----------------------------------------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        //groceryList.addAll(ArraysReview.asList( "Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry" , "Paper Towels" ));

        //check if Soda, Wine, Beer all of the are contained in groceryList
        boolean r =groceryList.containsAll(  Arrays.asList("Soda", "Wine", "Beer", "Coffee")  );

        System.out.println("r = " + r);


        System.out.println("------------------------------------");

        ArrayList<String> l = new ArrayList<>();
        l.add("Enes");
        l.add("Akbor"); //{Enes, Akbor}
        l.add(1, "Alex"); //{Enes, Alex, Akbor}
        l.add(0, "Alp");  //{"Alp", Enes, Alex, Akbor}

        System.out.println(l);
    }
}
