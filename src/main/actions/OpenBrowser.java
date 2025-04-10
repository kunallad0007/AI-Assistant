package main.actions;

import java.io.IOException;

public class OpenBrowser {
    public void execute(){
        try{
            new ProcessBuilder("cmd", "/c", "start chrome").start();
            System.out.println("Opening Chrome...");
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
