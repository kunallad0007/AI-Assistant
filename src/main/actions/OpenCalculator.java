package main.actions;

import java.io.IOException;

public class OpenCalculator {
    public void execute(){
        try{
            new ProcessBuilder("cmd", "/c", "start calc").start();
            System.out.println("Opening Calculator...");
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
