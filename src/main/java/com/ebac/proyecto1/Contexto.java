package com.ebac.proyecto1;

import com.ebac.proyecto1.dto.Author;
import com.ebac.proyecto1.dto.Book;
import com.ebac.proyecto1.dto.Library;
import com.ebac.proyecto1.dto.User;

public class Contexto {

    public static void main(String[] args) {
        Library library = new Library();

        // Crear y agregar un libro
        Book book = new Book("La fortaleza digital", "Dan Brown", 1998, "8489367019");
        library.addBook(book);

        // Crear y agregar un autor
        Author author = new Author("Irving", "Yalom", "Destacado psiquiatra y escritor estadounidense, conocido por su trabajo en psicoterapia y su enfoque humanista-existencial.");
        library.addAuthor(author);

        // Crear y agregar un usuario
        User user = new User("francisco123", "francisco123@gmail.com", "qwerty123");
        library.addUser(user);

        /**
         * IMPORTANTE A TENER EN CUENTA:
         *
         * Imprime la información que se está guardando en los POJOS
         * Realiza operaciones de eliminación de elementos
         * Realiza operaciones de actualización de elementos
         *
         * Eres libre de agregar más parámetros o bien de cambiar las clases sugeridas
         * Cualquier adición será considerada
         */
    }
}
