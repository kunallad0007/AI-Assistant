package main.actions;

import java.time.LocalTime;

public class ShowTime {

    public void execute(){
        System.out.println("Current time is: " + LocalTime.now());
    }

}
