package com.example.demo.controller;

import com.example.demo.models.Author;
import com.example.demo.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("")
    public ResponseEntity<List<Author>> getAuthors(){
        return ResponseEntity.ok(authorService.getAuthors());
    }

    @GetMapping("/byFirstName/{fn}")
    public ResponseEntity<List<Author>> getAuthorsByFirstName(@PathVariable String fn){
        return ResponseEntity.ok(authorService.getAuthorsByFirstName(fn));
    }

    @GetMapping("/byFirstNameIC/{fn}")
    public ResponseEntity<List<Author>> getAuthorsByFirstNameIC(@PathVariable String fn){
        return ResponseEntity.ok(authorService.getAuthorsByFirstNameIC(fn));
    }

    @GetMapping("/byFirstNameSWIC/{fn}")
    public ResponseEntity<List<Author>> getAuthorsByFirstNameSWIC(@PathVariable String fn){
        return ResponseEntity.ok(authorService.getAuthorsByFirstNameSWIC(fn));
    }
}
