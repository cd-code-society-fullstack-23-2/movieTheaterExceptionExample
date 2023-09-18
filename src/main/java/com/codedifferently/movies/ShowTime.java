package com.codedifferently.movies;

public class ShowTime {
    private static int showCount = 1;
    private Integer id;
    private String date;
    private Ticket[] seats;

    public ShowTime(String date, Integer numberOfSeats){
        id = showCount++;
        this.date = date;
        this.seats = new Ticket[numberOfSeats];
    }

    public String showAvailableSeats(){
        StringBuilder builder = new StringBuilder();
        for(int x =0; x < seats.length; x++){
            int seatNumber = x+1;
            if (seats[x] == null) {
                builder.append(seatNumber + ")Open\n");
            }else{
                builder.append(seatNumber + ")Closed\n");
            }
        }
        return builder.toString();
    }

    public Ticket bookSeat(Integer seatNumber) throws SeatNotAvailableException{
        if(seats[seatNumber] != null){
            throw new SeatNotAvailableException();
        }
        Ticket ticket = new Ticket(seatNumber);
        seats[seatNumber] = ticket;
        return ticket;
    }
}
