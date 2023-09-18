package com.codedifferently.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShowTimeTest {

    private ShowTime showTime;

    @BeforeEach
    public void setUp(){
        showTime = new ShowTime("Monday 3pm", 4);
    }

    @Test
    public void showAvailableSeatsTest01(){
        String expected ="1)Open\n2)Open\n3)Open\n4)Open\n";
        String actual = showTime.showAvailableSeats();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bookSeatTest01() throws SeatNotAvailableException{
        Ticket ticket = showTime.bookSeat(1);
        String expected = "Seat number: 2";
        String actual = ticket.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bookSeatTest02(){
        Assertions.assertThrows(SeatNotAvailableException.class, ()->{
            showTime.bookSeat(1);
            showTime.bookSeat(1);
        });
    }
}
