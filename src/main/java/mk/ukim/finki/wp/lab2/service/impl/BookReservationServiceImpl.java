package mk.ukim.finki.wp.lab2.service.impl;

import mk.ukim.finki.wp.lab2.model.BookReservation;
import mk.ukim.finki.wp.lab2.repository.mock.InMemoryBookReservationRepository;
import mk.ukim.finki.wp.lab2.service.BookReservationService;
import org.springframework.stereotype.Service;

@Service
public class BookReservationServiceImpl implements BookReservationService {
    private final InMemoryBookReservationRepository bookReservationRepository;

    public BookReservationServiceImpl(InMemoryBookReservationRepository bookReservationRepository) {
        this.bookReservationRepository = bookReservationRepository;
    }

    @Override
    public BookReservation placeReservation(String bookTitle, String readerName, String readerAddress, int numberOfCopies) {
        BookReservation bookReservation = new BookReservation(bookTitle, readerName, readerAddress, numberOfCopies);
        return bookReservationRepository.save(bookReservation);
    }
}