package Class85.Task;

import java.io.FileReader;
import java.io.FileWriter;

public class IfNegetiveInput {
    public static void main(String[] args) {
        try {
            String inputPath = "E:\\Kodenest\\JAVA\\Class85\\input.txt";
            String outputPath = "E:\\Kodenest\\JAVA\\Class85\\output.txt";

            FileReader reader = new FileReader(inputPath);
            FileWriter writer = new FileWriter(outputPath);

            int x;
            while ((x = reader.read()) != -1) {
                writer.write(x);
            }

//            Task if a no is negetive in the file how it read
//            the read method reads from the file as a character not as a integer or something else
//            it read as a charcter and return the Unicode as a int

//            x = reader.read();
//            char c = (char) x;
//            System.out.println(c);


            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
