package mk.ukim.finki.wp.lab2.repository.mock;

import mk.ukim.finki.wp.lab2.model.BookReservation;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemoryBookReservationRepository {
    public BookReservation save(BookReservation bookReservation) ;
}