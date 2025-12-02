package mk.ukim.finki.wp.lab2.repository.mock;

import mk.ukim.finki.wp.lab2.model.Author;
import mk.ukim.finki.wp.lab2.model.Book;

import java.util.List;

public interface InMemoryBookRepository {
    List<Book> findAll();
    List<Book> searchBooks(String text, double rating);
    List<Book> findAllByAuthor_Id(Long authorId);

    Book findBook(Long id);
    Book add(String title, String genre, Double averageRating, Author author);
    Book update(Long id, String title, String genre, Double averageRating, Author author);
    void delete(Long id);
}