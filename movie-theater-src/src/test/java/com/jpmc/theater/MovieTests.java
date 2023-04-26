package com.jpmc.theater;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTests {
    @Test
    void specialMovieWith50PercentDiscount() {
        Movie spiderMan = new Movie("Spider-Man: No Way Home", Duration.ofMinutes(90),12.5, 1);
        //Showing showing = new Showing(spiderMan, 5, LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        Showing showing = new Showing(spiderMan, 5, LocalDateTime.of(LocalDate.now(), LocalTime.of(9, 0)));
        assertEquals(10, spiderMan.calculateTicketPrice(showing));

        System.out.println(Duration.ofMinutes(90));
    }

    @Test
    void specialMovieWithStartingTimeDiscount() {
        Movie spiderMan = new Movie("Spider-Man: No Way Home", Duration.ofMinutes(90),12.5, 1);
        Showing showing = new Showing(spiderMan, 5, LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 0)));
        assertEquals(9.375, spiderMan.calculateTicketPrice(showing));

        System.out.println(Duration.ofMinutes(90));
    }

    @Test
    void specialMovieWithSequenceDiscount() {
        Movie spiderMan = new Movie("Spider-Man: No Way Home", Duration.ofMinutes(90),12.5, 0);
        Showing showing = new Showing(spiderMan, 7, LocalDateTime.of(LocalDate.now(), LocalTime.of(9, 0)));
        assertEquals(11.5, spiderMan.calculateTicketPrice(showing));

        System.out.println(Duration.ofMinutes(90));
    }
}
