package actions;

import java.io.IOException;

public class OpenSpotify{

    public void execute(){

        try{
            new ProcessBuilder("cmd","/c","start spotify").start();
            System.out.println("Launching Spotify app...");
        }catch(IOException e){
            System.err.println("Sorry, I didn't understand you !");
        }

    }

}