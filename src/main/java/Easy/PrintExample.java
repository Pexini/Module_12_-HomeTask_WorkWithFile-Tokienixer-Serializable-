package Easy;

import java.io.*;
import java.time.LocalDateTime;

public class PrintExample {
    private static final String FILE  = "FileForProgram/File_Easy/LocalTime_result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(FILE);
        printWriter.println(LocalDateTime.now());
        printWriter.close();
    }
}
