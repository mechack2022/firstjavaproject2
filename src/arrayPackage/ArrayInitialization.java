package arrayPackage;

public class ArrayInitialization {
    final int ARRAY_LENGTH = 10;
    int[] array  = new int[ARRAY_LENGTH];

    public void initiazeArray(){
//        generaate array value
        for(int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

           System.out.printf("%s%8%s\n", "index", "value");

        for(int counter = 0 ; counter<array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }

    public int sumArrayElement(){
        int sum = 0;
        for(int counter = 0 ; counter<array.length; counter++){
            sum += array[counter];
        }
        System.out.printf("the sum  of the array is %d\n",sum);
        return sum;
    }

}
