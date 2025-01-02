package Class86;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        String path = "E:\\Kodenest\\JAVA\\Class85\\output";

        File file = new File(path);

        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Is hidden: " + file.isHidden());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Can execute: " + file.canExecute());
        System.out.println("Name: " + file.getName());
        System.out.println("Parent Name: " + file.getParent());
        System.out.println();
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Canonical Path: " + file.getCanonicalPath());
        System.out.println("Path: " + file.getPath());
    }
}
