package Middle.Task4;

import java.io.*;
import java.nio.file.Files;

public class Main {
    private static final String IN = "FileForProgram/Middle_Files/Task_4_in";
    private static final String OUT = "FileForProgram/Middle_Files/Task_4_ out_WithMatches";
    public static void main(String[] args) throws Exception {
        File in = new File(IN);
        File out = new File(OUT);


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
             PrintWriter printWriter = new PrintWriter(new FileWriter(out))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                StringBuilder withoutNumbers = new StringBuilder();
                for (char ch : line.toCharArray()) {
                    if (!Character.toString(ch).matches("\\d")) {
                        withoutNumbers.append(ch);
                    }
                }
                printWriter.println(withoutNumbers);
            }
            System.out.println("Numbers was deleted");
        } catch (IOException e) {
            System.out.println("Something was wrong");
        }
    }
}