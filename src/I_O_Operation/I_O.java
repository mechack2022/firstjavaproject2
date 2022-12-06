package I_O_Operation;

import java.io.*;

public class I_O {


    public static void main(String[] args) {
        try {
//            FileInputStream reader1 = new FileInputStream("/Users/decagon/documents/file_input_output_files/textfile1.txt");
            BufferedReader bsi = new BufferedReader(new FileReader("/Users/decagon/documents/file_input_output_files/textfile1.txt"));
            String line = bsi.readLine();
            while (line != null) {
                System.out.println(line);
                line = bsi.readLine();
            }
            bsi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
