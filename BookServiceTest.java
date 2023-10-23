package dz4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository; 

    @InjectMocks
    private BookService bookService; 

    @Test
    public void testGetBookById() {
        Book book = new Book(1,"Title", "Author");
        when(bookService.getId(book)).thenReturn(1);
        verify(bookRepository).getId(book );
        verify(bookRepository).getBookById(1);
    }

    @Test
    public void testSaveBook() {
        Book book = new Book(1,"Title", "Author");
        bookService.saveBook(book);
        verify(bookRepository).saveBook(book);
    }
}
