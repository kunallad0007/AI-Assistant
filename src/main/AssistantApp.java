package main;

import main.core.CommandProcessor;

import java.util.Scanner;

public class AssistantApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommandProcessor processor = new CommandProcessor();

        System.out.println("Welcome to AI Assistance!");
        while(true){
            System.out.print("How can I help you Today: ");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("exit")) break;

            processor.processCommand(input);
        }

    }
}
