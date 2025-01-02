package Class85;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {
    public static void main(String[] args) {
        try {
            String inputPath = "E:\\Kodenest\\JAVA\\Class85\\input";
            String outputPath = "E:\\Kodenest\\JAVA\\Class85\\output";

            FileInputStream fileInputStream = new FileInputStream(inputPath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath);

            int x;
            while ((x = fileInputStream.read()) > 0) {
                fileOutputStream.write(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
