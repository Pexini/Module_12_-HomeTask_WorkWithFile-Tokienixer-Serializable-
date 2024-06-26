package Middle.Task2;

import java.io.*;

public class Main_v1_case {
    private static final String FILE_IN = "FileForProgram/Middle_Files/Task_2_Numbes_NUM";
    private static final String FILE_OUT = "FileForProgram/Middle_Files/Task_2_Numbes_WORDS_case";
    public static void main(String[] args) throws Exception {

        File in = new File(FILE_IN);
        File out = new File(FILE_OUT);

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
             PrintWriter printWriter = new PrintWriter(new FileWriter(out))
             ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String number : numbers) {
                    int num = Integer.parseInt(number);
                    switch (num) {
                        case 1:
                            printWriter.write("один");
                            break;
                        case 2:
                            printWriter.write("два");
                            break;
                        case 3:
                            printWriter.write("три");
                            break;
                        case 4:
                            printWriter.write("четыре");
                            break;
                        case 5:
                            printWriter.write("пять");
                            break;
                        case 6:
                            printWriter.write("шесть");
                            break;
                        case 7:
                            printWriter.write("семь");
                            break;
                        case 8:
                            printWriter.write("восемь");
                            break;
                        case 9:
                            printWriter.write("девять");
                            break;
                        case 10:
                            printWriter.write("десять");
                            break;
                        case 11:
                            printWriter.write("одиннадцать");
                            break;
                        case 12:
                            printWriter.write("двенадцать");
                            break;
                        default:
                            printWriter.write(num + "\n");
                    }
                }
                printWriter.println();
            }

            System.out.println("Цифры были заменены на слова");

        }

    }

}


