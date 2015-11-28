package org.example.webapp;

import org.example.webapp.models.Book;
import org.example.webapp.repositories.BooksRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BooksServletTest {

    @Mock
    private HttpServletResponse response;

    @Mock
    private HttpServletRequest request;

    @Mock
    private RequestDispatcher requestDispatcher;

    @Mock
    private BooksRepository booksRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoGet() throws Exception {
        List<Book> books = new ArrayList<Book>() {{
            add(new Book());
            add(new Book());
        }};

        when(booksRepository.findAll()).thenReturn(books);
        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);

        BooksServlet servlet = new BooksServlet(booksRepository);
        servlet.doGet(request, response);

        verify(request).setAttribute("books", books);
        verify(request).getRequestDispatcher("books.jsp");
    }
}