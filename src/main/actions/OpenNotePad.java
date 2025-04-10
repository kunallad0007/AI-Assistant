package main.actions;

import java.io.IOException;

public class OpenNotePad {
    public void execute(){
        try{
            new ProcessBuilder("notepad").start();
            System.out.println("Opening notepad...");
        }catch (IOException e){
            System.err.println("Error: "+ e.getMessage());
        }
    }
}
