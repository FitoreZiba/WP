package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {

    @Override
    public List<Book> findAll() {
        return DataHolder.books;
    }

    @Override
    public List<Book> searchBooks(String text, Double rating) {
        List<Book> correct=new ArrayList<>();
       List<Book> books = DataHolder.books;
        books.forEach(book -> {
            if(book.getTitle().toLowerCase().contains(text.toLowerCase()) && book.getAverageRating()>=rating){
                correct.add(book);
            }
        });

        return correct;

    }
}
