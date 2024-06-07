package Middle.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File in = new File("FileForProgram/Middle_Files/Task_4_in");
        File out = new File("FileForProgram/Middle_Files/Task_4_ out_WithMatches");
//        File out = new File("FileForProgram/Middle_Files/Task_4_ out_WithReplaceAll");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)))
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
