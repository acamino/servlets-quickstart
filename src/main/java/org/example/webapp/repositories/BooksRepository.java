package org.example.webapp.repositories;

import org.example.webapp.models.Book;

public class BooksRepository extends Repository<Book> {

    public BooksRepository() {
        super(Book.class);
    }
}
