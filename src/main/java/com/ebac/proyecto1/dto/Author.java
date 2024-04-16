package com.ebac.proyecto1.dto;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private String biography;
    private List<Book> publishedBooks = new ArrayList<>();

    public Author(String firstName, String lastName, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
    }

    // Getters y setters
}
