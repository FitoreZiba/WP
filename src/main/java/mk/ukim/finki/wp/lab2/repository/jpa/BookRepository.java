package mk.ukim.finki.wp.lab2.repository.jpa;


import mk.ukim.finki.wp.lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor_Id(Long authorId);
}