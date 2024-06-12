package Middle.Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String IN = "FileForProgram/Middle_Files/Task_3_in";
    private static final String OUT = "FileForProgram/Middle_Files/Task_3_out";
    public static void main(String[] args) throws Exception {

        File in = new File(IN);
        File out = new File(OUT);

        try (
                BufferedReader bufferedReader = new BufferedReader( new FileReader( in));
                PrintWriter printWriter = new PrintWriter(new  FileWriter(out))
        ) {

            String line;
            // Считываем строки из исходного файла
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                // Разбиваем строку на слова
                for (int i = 0; i < words.length; i++) {
                    words[i] = reverseWord(words[i]);
                }
                StringBuilder reversedeLine = new StringBuilder();
                for (String word : words) {
                    reversedeLine.append(word).append(" ");
                }
                // Записываем перевернутую строку в результирующий файл
                printWriter.println(reversedeLine.toString().trim());
            }

            System.out.println("Файл успешно перевернут.");
        } catch (IOException e) {
            System.out.println("Поврежденный файл");

        }

    }
    // Метод для переворачивания слова
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}



