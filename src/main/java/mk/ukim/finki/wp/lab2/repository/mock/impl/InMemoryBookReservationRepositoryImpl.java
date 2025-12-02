package mk.ukim.finki.wp.lab2.repository.mock.impl;

import mk.ukim.finki.wp.lab2.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab2.model.BookReservation;
import mk.ukim.finki.wp.lab2.repository.mock.InMemoryBookReservationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBookReservationRepositoryImpl implements InMemoryBookReservationRepository {
    @Override
    public BookReservation save(BookReservation bookReservation) {
        DataHolder.reservations.add(bookReservation);
        return bookReservation;
    }
}