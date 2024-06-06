package Middle.Task1;


import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName()); // попробовал использовать логгер в коде

    public static void main(String[] args) throws Exception {
        File read = new File("FileForProgram/Middle_Files/File_Middle_Task1");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(read)));) {
            Map<String, Integer> wordMap = new HashMap<>();


            bufferedReader.lines().forEach(text -> {
                String cleanedLine = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();
                String[] arrayString = cleanedLine.split("\\s+");

                for (String str : arrayString) {
                    if (!str.isEmpty()) {                                     // добавил проверку на пустую строку, так как без нее выпадает две пустые строки
                        wordMap.put(str, wordMap.getOrDefault(str, 0) + 1);
                    }
                }
            });

            Map<String, Integer> sortedMap = wordMap.entrySet()
                    .stream()
                    .sorted(
                            Map.Entry.<String, Integer>comparingByValue
                                    (Comparator.reverseOrder()))
                    .collect(
                            Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (e1, e2) -> e1,
                                    LinkedHashMap::new
                            ));
            sortedMap.forEach((str, count) -> System.out.println(str + "[" + count + "]"));

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading the file", e);
        }
    }

}