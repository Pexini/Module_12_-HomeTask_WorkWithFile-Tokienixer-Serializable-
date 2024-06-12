package Hard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static final String FILE_OUT = "FileForProgram/Middle_Files/Task_4_Hero/Diary";

    public static void main(String[] args) throws IOException {
        File outFile = new File(FILE_OUT);
        try (PrintWriter writer = new PrintWriter(new FileWriter(outFile, true))) {


            Hero hero = new Hero("Konor", writer);

            hero.go("Cinema");
            hero.meal("Pop-corn");
            hero.smbd("T1000");

        }
    }
}
