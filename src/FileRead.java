import java.io.File;
import java.util.Date;

public class FileRead {
    public static void main(String[] args) {
        File folder = new File("/Users/maharjun/Downloads/");
        File[] listOfFiles = folder.listFiles();
        File file2 = new File("someNewFile.txt");
        System.out.println(file2.exists());
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                int length = listOfFiles[i].getName().length();
                if (listOfFiles[i].getName().substring(length - 4).equals(".jpg")) {
                    File existedFile = new File(listOfFiles[i].getAbsolutePath());
                    System.out.println(existedFile.exists() + "  " + existedFile.getName() + "  " + listOfFiles[i].getAbsolutePath());
                    System.out.println("File " + listOfFiles[i].getName());

                }
            }
        }

        new Date();
    }
}
