package Middle.Task2;

import java.io.*;

public class Main_v2_array {
    private static final String FILE_IN = "FileForProgram/Middle_Files/Task_2_Numbes_NUM";
    private static final String FILE_OUT = "FileForProgram/Middle_Files/Task_2_Numbes_WORDS_array.txt";

    public static void main(String[] args) throws Exception {
        File in = new File(FILE_IN);
        File out = new File(FILE_OUT);

        String[] words = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать", "двадцать один", "двадцать два", "двадцать три", "двадцать четыре", "двадцать пять",
                "двадцать шесть", "двадцать семь", "двадцать восемь", "двадцать девять", "тридцать", "тридцать один", "тридцать два", "тридцать три", "тридцать четыре", "тридцать пять",
                "тридцать шесть", "тридцать семь", "тридцать восемь", "тридцать девять", "сорок", "сорок один", "сорок два", "сорок три", "сорок четыре", "сорок пять", "сорок шесть",
                "сорок семь", "сорок восемь", "сорок девять", "пятьдесят", "пятьдесят один", "пятьдесят два", "пятьдесят три", "пятьдесят четыре", "пятьдесят пять", "пятьдесят шесть",
                "пятьдесят семь", "пятьдесят восемь", "пятьдесят девять", "шестьдесят", "шестьдесят один", "шестьдесят два", "шестьдесят три", "шестьдесят четыре", "шестьдесят пять",
                "шестьдесят шесть", "шестьдесят семь", "шестьдесят восемь", "шестьдесят девять", "семьдесят", "семьдесят один", "семьдесят два", "семьдесят три", "семьдесят четыре",
                "семьдесят пять", "семьдесят шесть", "семьдесят семь", "семьдесят восемь", "семьдесят девять", "восемьдесят", "восемьдесят один", "восемьдесят два", "восемьдесят три",
                "восемьдесят четыре", "восемьдесят пять", "восемьдесят шесть", "восемьдесят семь", "восемьдесят восемь", "восемьдесят девять", "девяносто", "девяносто один", "девяносто два",
                "девяносто три", "девяносто четыре", "девяносто пять", "девяносто шесть", "девяносто семь", "девяносто восемь", "девяносто девять", "сто"};

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)));) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] numbers = line.split("\\s+");
                for (String number : numbers) {
                    int num = Integer.parseInt(number);
                    if (num >= 0 && num <= 100) {
                        printWriter.write(words[num] + " ");
                    } else {
                        printWriter.write(number + " ");
                    }
                }
            printWriter.println();
            }
            printWriter.close();
            System.out.println("Цифры были заменены на слова");
        }catch (IOException e){
            System.out.println("Something wrong");
        }

    }
}

