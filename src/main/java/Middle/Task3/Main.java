package Middle.Task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    private static final String IN = "FileForProgram/Middle_Files/Task_3_in";
    private static final String OUT = "FileForProgram/Middle_Files/Task_3_out";

    public static void main(String[] args) {

        try {
            String content = Files.readString(Paths.get(IN));
            String reversedContent = new StringBuilder(content).reverse().toString();
            try (PrintWriter printWriter = new PrintWriter(new File(OUT))) {
                printWriter.println(reversedContent);
            }

            System.out.println("Файл успешно перевернут.");
        } catch (IOException e) {
            System.out.println("Wrong");
        }
    }
}




