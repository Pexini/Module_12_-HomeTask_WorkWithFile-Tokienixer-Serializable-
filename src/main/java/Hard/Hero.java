package Hard;

import java.io.*;

public class Hero {
    private String name;
    private PrintWriter writer;

    public Hero(String name) {
        this.name = name;
        try {
            writer = new PrintWriter(new FileWriter("FileForProgram/Middle_Files/Task_4_Hero/Diary", true), true);
        } catch (IOException e) {
            System.out.println("An error occurred while opening the file.");

        }
    }

    private void fileAction(String action) {
        writer.println(action);
    }

    public void go(String to) {
        String action = name + ": I was in " + to;
        fileAction(action);
    }

    public void meal(String meal) {
        String action = name + ": I eaten " + meal;
        fileAction(action);
    }

    public void smbd(String smbd) {
        String action = name + ": I talked with " + smbd;
        fileAction(action);
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }

}
