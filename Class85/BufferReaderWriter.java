package Class85;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderWriter {
    public static void main(String[] args) {
        try {
            String inputPath = "E:\\Kodenest\\JAVA\\Class85\\input";
            String outputPath = "E:\\Kodenest\\JAVA\\Class85\\output    ";

            FileReader reader = new FileReader(inputPath);
            FileWriter writer = new FileWriter(outputPath);

            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            int x;
            while ((x = bufferedReader.read()) > 0) {
                bufferedWriter.write(x);
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
