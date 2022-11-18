package arrayPackage;
/*
*Storing Student Grades in a Two-Dimensional Array in Class GradeBook
GradeBook application that uses a two-dimensional array
* grades to store the grades of a number of students on multiple exams.
* Each row of the array represents a single student’s grades for the entire
* course, and each column represents the grades of all the students who took
*  a particular exam. Class GradeBookTest passes the array as an
* argument to the GradeBook constructor. In this example, we use a
* ten-by-three array for ten students’ grades on three exams. Five methods
* perform array manipulations to process the grades. Each method is similar
* to its counterpart in the earlier one-dimensional array version of GradeBook
*  . Method getMinimum, determines the lowest grade
*  any student for the semester. Method getMaximum determines
* the highest grade of any student for the semester. Method getAverage
* determines a particular student’s semester average. Method
* outputBarChart  outputs a grade bar chart for the entire
* semester’s student grades. Method outputGrades outputs the
* array in a tabular format, along with each student’s semester average.
* */

public class GradeBook {

     private int[][]  grades;
      private String courseName;

      public GradeBook(String name, int[][] courseGrades ){
        courseName = name;
        grades = courseGrades;
  }
     public void setCourseName(String name){
          courseName = name;
     }

     public String getCourseName(){
       return courseName;
     }

     public void displayMessage(){
          System.out.printf("Welcome to the grade book for\\n%s!\\n\\n", getCourseName());
     }

//    get the minimum score of the students
    public int getMinimum(){
//          assume the first element is the lowest grade
         int lowGrade = grades[0][0];
//        loop through the row of the array
        for(int[] studentGrade : grades){
//            loop through the column of each row
            for(int grade : studentGrade){
              if(grade < lowGrade){
                  lowGrade = grade;
              }
            }
        }
       return lowGrade;
    }
//
//    get maximum score of the sftudents
     public int getMaximum(){
//         assume the first element is the highest grade
         int highestGrade = grades[0][0];
//        loop through the row of the array
         for(int[] studentGrade : grades){
//            loop through the column of each row
             for(int grade : studentGrade){
                 if(grade > highestGrade){
                     highestGrade = grade;
                 }
             }
         }
         return highestGrade;
     }
//      average of a row i.e the average of a student in all courses
     public double calculateGradeAverage(int[] setOfGrade){
          int total = 0;
          double average ;
              for(int grade : setOfGrade){
                  total +=  grade;
              }

          return average =  total / setOfGrade.length ;
     }

     public void gradeBarChat(){
          System.out.println("Overall grade distribution");
          //// stores frequency of grades in each range of 10 grades
          int[] frequency = new int[11];

//         for each grade in gradebook, increament appropraite frequency
          for(int[] studentGrades : grades){
              for(int grade : studentGrades){
                ++frequency[grade/10];
              }
          }

         for(int counter = 0; counter < frequency.length; counter++){
//       output bar label ( "00-09: ", ..., "90-99: ", "100: "
             if( counter == 10 ){
                 System.out.printf( "%5d: ", 100 );
             } else
                 System.out.printf( "%02d-%02d: ", counter * 10, counter * 10 + 9 );

             // print bar of asterisks
             for ( int stars = 0; stars < frequency[ counter ]; stars++ )
                 System.out.print( "*" );
             System.out.println(); // start a new line of output
         }
     }

    public void outputGrades(){
        System.out.println("Below are the grades");
        System.out.print("                ");
//      create columns heading like test 1 test 2 ...
        for(int test = 0; test<grades[0].length; test++)
            System.out.printf("test%2d  ", test + 1 );
        System.out.print("Average \n");
//     create rows/columns of text representing array grades
        for(int student = 0; student < grades.length; student++)
        {
            System.out.printf("student %2d", student + 1);
            for(int test : grades[student])
              {
                System.out.printf("%8d", test);
               }
            double average = calculateGradeAverage( grades[ student ] );
             System.out.printf( "%9.2f\n", average );
        }
      }

            public void processGrades() {
                // output grades array
                outputGrades();
                // call methods getMinimum and getMaximum
                System.out.printf( "\n%s %d\n%s %d\n\n",
                        "Lowest grade in the grade book is", getMinimum(),
                        "Highest grade in the grade book is", getMaximum() );
                // output grade distribution chart of all grades on all tests
                gradeBarChat();
            }


}


