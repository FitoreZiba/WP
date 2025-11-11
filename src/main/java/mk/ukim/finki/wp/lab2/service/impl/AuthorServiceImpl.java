package mk.ukim.finki.wp.lab2.service.impl;

import mk.ukim.finki.wp.lab2.model.Author;
import mk.ukim.finki.wp.lab2.repository.AuthorRepository;
import mk.ukim.finki.wp.lab2.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll(){
       return authorRepository.findAll();

    }
}
