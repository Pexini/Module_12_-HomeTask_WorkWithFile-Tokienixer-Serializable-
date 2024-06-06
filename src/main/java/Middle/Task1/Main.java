package Middle.Task1;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        File read = new File("FileForProgram/File_Middle_Task1");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(read)));
        bufferedReader.lines().forEach(x -> {
            String[] arrayString = x.split(" ");

            Map<String, Integer> wordMap = new HashMap<>();
            for (String str : arrayString) {
                wordMap.put(str, wordMap.getOrDefault(str, 0) + 1);
            }
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
            sortedMap.forEach((str, count) -> System.out.println( str + "[" + count + "]"));


        });
        bufferedReader.close();

    }
}
