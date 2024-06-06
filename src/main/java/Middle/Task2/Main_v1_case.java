package Middle.Task2;

import java.io.*;

public class Main_v1_case {
    public static void main(String[] args) throws Exception {

        File in = new File("FileForProgram/Middle_Files/Task_2_Numbes_NUM");
        File out = new File("FileForProgram/Middle_Files/Task_2_Numbes_WORDS");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in))); PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out)));) {
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
            bufferedReader.close();
            printWriter.close();
            System.out.println("Цифры были заменены на слова");
        } catch (IOException e) {
            System.out.println("Поврежденный файл");


        }

    }

}


