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
          System.out.printf("welcome to class %s\n", getCourseName());
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

     public double calculateGradeAverage(){
          int sum = 0;
          double average ;
//         loop through the row of the array
          for(int[] studentGrade : grades){
              for(int grade : studentGrade){
                  sum +=  grade;
              }
          }
          average = sum / 30 ;
          return average;
     }
}
