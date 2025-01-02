package Class85.Task;

import java.io.FileReader;
import java.io.FileWriter;

public class PrintStringInNextLine {
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
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
