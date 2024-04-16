package com.ebac.proyecto1.dto;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addUser(User user) {
        users.add(user);
    }

    // ... Agerga otros métodos para eliminar y actualizar elementos (libro, autor, usuario)
}
