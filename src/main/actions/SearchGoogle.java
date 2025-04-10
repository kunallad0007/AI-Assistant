package main.actions;

import java.io.IOException;

public class SearchGoogle {

    private String query;

    public SearchGoogle(String input){
        this.query = input.toLowerCase().replace("search goggle", "").trim();
    }

    public void execute(){
        if(query.isEmpty()){
            System.err.println("Please enter something to search");
            return;
        }

        String formattedQuery = query.replace(" ", "+");
        String url = "https://www.google.com/search?q="+formattedQuery;

        try{
            new ProcessBuilder("cmd","/c","start " + url).start();
            System.out.println("Searching Google for: " + query);
        }catch (IOException e){
            System.err.println("Error while opening browser: " + e.getMessage());
        }

    }

}
