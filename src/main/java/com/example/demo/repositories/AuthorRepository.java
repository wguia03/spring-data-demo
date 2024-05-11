package com.example.demo.repositories;

import com.example.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findAllByFirstName(String fn);
    List<Author> findAllByFirstNameIgnoreCase(String fn);
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);
}
