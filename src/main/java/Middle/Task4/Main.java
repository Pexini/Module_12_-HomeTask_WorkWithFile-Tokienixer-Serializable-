package Middle.Task4;

import java.io.*;

public class Main {
    private static final String IN = "FileForProgram/Middle_Files/Task_4_in";
    private static final String OUT = "FileForProgram/Middle_Files/Task_4_ out_WithMatches";
    public static void main(String[] args) throws Exception {
        File in = new File(IN);
        File out = new File(OUT);
//        File out = new File("FileForProgram/Middle_Files/Task_4_ out_WithReplaceAll");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
             PrintWriter printWriter = new PrintWriter(new FileWriter(out))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
//                String withoutNumbers = line.replaceAll("\\d+", "");                    Удаление цифр с помощью ReplaceAll
//                printWriter.println(withoutNumbers);

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
