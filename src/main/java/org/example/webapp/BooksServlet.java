package org.example.webapp;

import org.example.webapp.models.Book;
import org.example.webapp.repositories.BooksRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BooksServlet extends HttpServlet {

    private final BooksRepository repository;

    @SuppressWarnings("unused")
    public BooksServlet() {
        this(new BooksRepository());
    }

    public BooksServlet(BooksRepository repository) {
        this.repository = repository;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Book> books = repository.findAll();

        request.setAttribute("books", books);
        request.getRequestDispatcher("books.jsp").forward(request, response);
    }
}
