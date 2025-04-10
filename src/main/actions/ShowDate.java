package main.actions;

import java.time.LocalDate;
import java.util.Locale;

public class ShowDate {

    public void execute(){
        System.out.println("Today's Date: "+ LocalDate.now());
    }

}
