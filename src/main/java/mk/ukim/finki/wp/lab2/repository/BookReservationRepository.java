package mk.ukim.finki.wp.lab2.repository;

import mk.ukim.finki.wp.lab2.model.BookReservation;

public interface BookReservationRepository {
    BookReservation save(BookReservation bookReservation);
}