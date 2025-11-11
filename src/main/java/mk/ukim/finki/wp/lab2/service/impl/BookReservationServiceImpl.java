package mk.ukim.finki.wp.lab2.service.impl;

import mk.ukim.finki.wp.lab2.model.BookReservation;
import mk.ukim.finki.wp.lab2.repository.BookReservationRepository;
import mk.ukim.finki.wp.lab2.service.BookReservationService;
import org.springframework.stereotype.Service;

@Service
public class BookReservationServiceImpl implements BookReservationService {
    private final BookReservationRepository bookReservationRepository;

    public BookReservationServiceImpl(BookReservationRepository bookReservationRepository) {
        this.bookReservationRepository = bookReservationRepository;
    }

    @Override
    public BookReservation placeReservation(String bookTitle, String readerName, String readerAddress, int numberOfCopies) {
        BookReservation bookReservation = new BookReservation(bookTitle, readerName, readerAddress, numberOfCopies);
        return bookReservationRepository.save(bookReservation);
    }
}