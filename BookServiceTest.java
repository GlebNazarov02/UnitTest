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
        when(bookRepository.getId()).thenReturn(1);
        int bookId = bookService.getBookById();
        verify(bookRepository).getId();
        assertEquals(1, bookId);
    }

    @Test
    public void testSaveBook() {
        Book book = new Book("Title", "Author");
        bookService.saveBook(book);
        verify(bookRepository).saveBook(book);
    }
}
