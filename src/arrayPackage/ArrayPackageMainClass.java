package arrayPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayPackageMainClass {

    public static void main(String[] args){
        int[][] grades = {
                { 87, 96, 70 },
                { 68, 87, 90 },
                { 94, 100, 90 },
                { 100, 81, 82 },
                { 83, 65, 85 },
                { 78, 87, 65 },
                { 85, 75, 83 },
                { 91, 94, 100 },
                { 76, 72, 84 },
                { 87, 93, 73 }
        };


        ArrayList< String > items = new ArrayList< String >();
        items.add( "red" );
        items.add( 0, "yellow" );
        items.add("taiwo");
        items.add("kenny");
        items.add("mumsy");
        items.add(2, "mumsy");

        display(items, "traversing using enhance loop");
//     using Iterator
        Iterator iterator= items.iterator();
        System.out.println("tranversing using iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


       BarChartsToDisplayArrayDataGraphically barChat = new  BarChartsToDisplayArrayDataGraphically();
       GradeBook gradeBook = new GradeBook("DECAGON CSC104", grades);
       barChat.displayResult();
       System.out.println("-------------------------");
        barChat.method2();
        System.out.println("-------------------------");
        System.out.println("MultidimentionalArray");
        barChat.multidimentionalArray();
        System.out.println("-------------------------");
        System.out.println("GradeBookTest");
        gradeBook.processGrades();
        System.out.println("-------------------------");
        System.out.println("Arraylist Collection");

//
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.printf("%s :", header);
        for (String item : items) {
            System.out.println(item);
        }
    }

}
