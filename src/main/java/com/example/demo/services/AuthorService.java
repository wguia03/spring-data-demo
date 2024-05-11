package com.example.demo.services;

import com.example.demo.models.Author;
import com.example.demo.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public List<Author> getAuthorsByFirstName(String fn){
        return authorRepository.findAllByFirstName(fn);
    }

    public List<Author> getAuthorsByFirstNameIC(String fn){
        return authorRepository.findAllByFirstNameIgnoreCase(fn);
    }

    public List<Author> getAuthorsByFirstNameSWIC(String fn){
        return authorRepository.findAllByFirstNameStartsWithIgnoreCase(fn);
    }
}
