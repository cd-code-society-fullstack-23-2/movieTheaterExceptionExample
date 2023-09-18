package com.codedifferently.movies;

import java.util.Scanner;

public class Main {

    public void displayShowTimeSeats(ShowTime showTime){
        String seats = showTime.showAvailableSeats();
        System.out.println(seats);
    }
    public void startUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Movie Differently");
        ShowTime showTime = new ShowTime("Tuesday 3pm", 5);
        Boolean keepRunning = true;
        while(keepRunning){
            String menu = "Menu:\n"
                    +"1) Select a seat\n"
                    +"0) Exit\n";
            System.out.println(menu);
            String input = scanner.next();
            switch(input){
                case "0":
                    keepRunning = false;
                    break;
                case "1":
                    displayShowTimeSeats(showTime);
                    break;
                default:
                    System.out.println("Bad selection");
                    break;
            }

        }
        System.out.println("Good bye");

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startUp();
    }
}
