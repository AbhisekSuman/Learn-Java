package Class85.Task;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ReadWriteImage {
    public static void main(String[] args) {
        try {
            File inputImg = new File("E:\\Kodenest\\JAVA\\Class85\\input.jpg");
            File outputImg = new File("E:\\Kodenest\\JAVA\\Class85\\output.jpg");

            BufferedImage image = ImageIO.read(inputImg);

            ImageIO.write(image, "jpg", outputImg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
