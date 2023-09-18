package com.codedifferently.movies;

public class Ticket {
    private static int idCount = 1;
    private Integer id;
    private Integer seat;

    public Ticket(Integer seat) {
        this.id = idCount++;
        this.seat = seat;
    }

    public String toString(){
        return "Seat number: " + (seat+1);
    }
}
