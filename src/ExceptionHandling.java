import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            FileReader myFile = new FileReader("exception.txt");
            System.out.print("file open");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        multipletTypeException();
        finalBlock();

    }

    //    newfile has FileNotFoundException and value has IOException
    public static void multipletTypeException() {
        System.out.println("MULTIPLE EXCEPTIONAL HANDLING");
        try {
            FileReader newFile = new FileReader("taiwo.pdf");
            var value = newFile.read();
        } catch (FileNotFoundException e) {
            System.out.print("File not found\n");
        } catch (IOException e) {
            System.out.print("file or interupt I/O process");
        }
    }

    //    final block
    public static void finalBlock() {
//        NOTE A FILE READ MUST ALWAYS BE CLOSE FOR OTHER DOCUMENTS TO HAVE ACESSS TO IT IT
        System.out.println("FINAL BLOCK IN HANDLING EXCEPTIONS");
        FileReader reader = null;
        try {
            reader = new FileReader("isGreat.doc");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } finally {
            if (reader != null) {
//            close the opened file
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
