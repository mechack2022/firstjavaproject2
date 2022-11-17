package arrayPackage;

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
        gradeBook.getMinimum();
        gradeBook.getMaximum();
        gradeBook.calculateGradeAverage();
    }
}
