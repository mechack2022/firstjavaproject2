package arrayPackage;

/*
Suppose the grades on an exam were 87, 68, 94, 100, 83, 78, 85, 91, 76
and 87. They include one grade of 100, two grades in the 90s, four grades
in the 80s, two grades in the 70s, one grade in the 60s and no grades below
60. develop and application that stores this grade distribution data in
an array of 11 elements, each corresponding to a category of grades.
For example, array[0] indicates the number of grades in the range 0–9,
array[7] the number of grades in the range 70–79 and array[10] the number
 of 100 grades.
 */

public class BarChartsToDisplayArrayDataGraphically {

//   array of grades
    int[] arrayOfFrequency ={0, 0, 0, 0,0, 0, 1, 2, 4, 2,1};

    public void displayResult(){

       for(int frequency= 0; frequency<=arrayOfFrequency.length-1; frequency++){
          String star = "*";
          System.out.println( star.repeat(arrayOfFrequency[frequency]));
       }

       System.out.printf("%8s%30s\n", "Score Range ", "number of students");
       for(int scoreRange = 0;  scoreRange<=100 ; scoreRange += 10) {
         System.out.printf("%d - %d\n", scoreRange, scoreRange + 9);
       }
    }

    public void method2(){

       for(int counter = 0; counter < arrayOfFrequency.length; counter++){
//       output bar label ( "00-09: ", ..., "90-99: ", "100: "
       if( counter == 10 ){
            System.out.printf( "%5d: ", 100 );
       } else
            System.out.printf( "%02d-%02d: ", counter * 10, counter * 10 + 9 );

       // print bar of asterisks
           for ( int stars = 0; stars < arrayOfFrequency[ counter ]; stars++ )
                  System.out.print( "*" );
           System.out.println(); // start a    new line of output
        }
    }

//    multidimentional array initialization and declaration
    public void multidimentionalArray(){
        int[][] array = {{1,2,3} , {21, 7}, {8,95 ,8} };

        // loop through array's rows
        for(int row = 0; row < array.length; row++){
//            // loop through columns of the current row
            for(int col = 0; col<array[row].length; col++)
                System.out.printf("%d  ", array[row][col]);
             System.out.println();  //next line
        }
    }
}
