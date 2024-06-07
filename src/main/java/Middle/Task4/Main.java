package Middle.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File in = new File("FileForProgram/Middle_Files/Task_4_in");
        File out = new File("FileForProgram/Middle_Files/Task_4_ out");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String withoutNumbers = line.replace("\\d+", "");
                printWriter.println(bufferedReader);
            }
            System.out.println("Numbers was deleted" + w);
        } catch (IOException e) {
            System.out.println("Something was wrong");
        }
    }
}
