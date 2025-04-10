package main.actions;

import java.io.IOException;

public class OpenYoutube {

    public void execute(){
        System.out.println();
        try {
            new ProcessBuilder("cmd", "/c","start https://www.youtube.com/").start();
            System.out.println("Opening YouTube");
        }catch (IOException e){
            System.err.println("Sorry, I didn't understand you");
        }
    }

}
