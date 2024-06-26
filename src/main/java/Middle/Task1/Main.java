package Middle.Task1;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName()); // попробовал использовать логгер в коде
    private static final String FILE_PATH = "FileForProgram/Middle_Files/File_Middle_Task1";

    public static void main(String[] args) throws Exception {
        File read = new File(FILE_PATH);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(read));) {
            //Метод с использованием FlatMap
            Map<String, Long> wordMap = bufferedReader.lines()
                    .flatMap(lines -> Arrays.stream(lines.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase().split("\\s+")))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            Map<String, Long> sortedMap = wordMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) ->e1,
                            LinkedHashMap:: new
                    ));
            sortedMap.forEach((str, count) -> System.out.println(str + "[" + count + "]"));


            //Метод с использованием HashMap
//            Map<String, Integer> wordMap = new HashMap<>();
//
//
//            bufferedReader.lines().forEach(text -> {
//                String cleanedLine = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").toLowerCase();
//                String[] arrayString = cleanedLine.split("\\s+");
//
//                for (String str : arrayString) {
//                    if (!str.isEmpty()) {                                     // добавил проверку на пустую строку, так как без нее выпадает две пустые строки
//                        wordMap.put(str, wordMap.getOrDefault(str, 0) + 1);
//                    }
//                }
//            });
//
//            Map<String, Integer> sortedMap = wordMap.entrySet()
//                    .stream()
//                    .sorted(
//                            Map.Entry.<String, Integer>comparingByValue
//                                    (Comparator.reverseOrder()))
//                    .collect(
//                            Collectors.toMap(
//                                    Map.Entry::getKey,
//                                    Map.Entry::getValue,
//                                    (e1, e2) -> e1,
//                                    LinkedHashMap::new
//                            ));
//            sortedMap.forEach((str, count) -> System.out.println(str + "[" + count + "]"));

        }
    }

}