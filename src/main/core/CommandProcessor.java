package main.core;

import main.actions.*;
import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {

    private Map<String, Runnable> commands = new HashMap<>();

    public CommandProcessor(){
        //Register all commands here
        //open browser
        commands.put("open browser", new OpenBrowser()::execute);

        //show time
        commands.put("what is the time", new ShowTime()::execute);

        //open notepad
        commands.put("open notepad", new OpenNotePad()::execute);

        //open calculator
        commands.put("open calculator", new OpenCalculator()::execute);

        //open YouTube
        commands.put("open youtube", new OpenYoutube()::execute);

        //open spotify
        commands.put("open spotify", new OpenSpotify()::execute);

    }


    public void processCommand(String input){
        boolean found = false;
        for(String command : commands.keySet()){
            if(input.toLowerCase().contains(command)){
                commands.get(command).run();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Sorry, I don't understand that yet.");
        }
    }
}
