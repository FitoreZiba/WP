package mk.ukim.finki.wp.lab2.repository;

import mk.ukim.finki.wp.lab2.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab2.model.BookReservation;
import mk.ukim.finki.wp.lab2.repository.BookReservationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBookReservationRepository implements BookReservationRepository {
    @Override
    public BookReservation save(BookReservation bookReservation) {
        DataHolder.reservations.add(bookReservation);
        return bookReservation;
    }
}