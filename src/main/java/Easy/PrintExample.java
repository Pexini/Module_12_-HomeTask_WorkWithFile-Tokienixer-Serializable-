package Easy;

import java.io.*;
import java.time.LocalDateTime;

public class PrintExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("FileForProgram/LocalTime_result.txt");
        printWriter.println(LocalDateTime.now());
        printWriter.close();
    }
}
