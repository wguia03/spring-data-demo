package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Author extends BaseEntity{

    private String firstName;

    private String lastName;

    private Integer age;

    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
