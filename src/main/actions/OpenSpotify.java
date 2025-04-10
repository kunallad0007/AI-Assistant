package actions;

import java.io.IOException;

public class OpenSpotify{

    public void execute(){

        try{
            new ProcessBuilder("cmd","/c","open spotify").start();
            System.out.println("Opening Spotify...");
        }catch(IOException e){
            System.err.println("Sorry, I didn't understand you !");
        }

    }

}