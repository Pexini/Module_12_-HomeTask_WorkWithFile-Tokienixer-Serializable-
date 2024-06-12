package Hard;

import java.io.*;

public class Hero {

    private String name;
    private PrintWriter writer;

    public Hero(String name, PrintWriter writer) {
        this.name = name;
        this.writer = writer;
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
}
