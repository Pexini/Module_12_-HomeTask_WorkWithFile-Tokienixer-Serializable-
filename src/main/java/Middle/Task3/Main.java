package Middle.Task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    private static final String IN = "FileForProgram/Middle_Files/Task_3_in";
    private static final String OUT = "FileForProgram/Middle_Files/Task_3_out";

    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get(IN));
            try (PrintWriter printWriter = new PrintWriter(new File(OUT))) {
                for (String line : lines) {
                    String reversLine = new StringBuilder(line).reverse().toString();
                    printWriter.println(reversLine);
                }
            }
            System.out.println("Файл успешно перевернут.");
        } catch (IOException e) {
            System.out.println("Wrong");
        }
    }
}




