package dz4;
import java.util.Map;
import java.util.HashMap;

public class BookService implements BookRepository {
    private Map<Integer, Book> bookMap;

    public BookService() {
        bookMap = new HashMap<>();
    }
    
    // Метод для сохранения книги
    @Override
    public void saveBook(Book book) {
        bookMap.put(book.getId(), book);
    }
    
    // Метод для получения ID книги
    @Override
    public int getId(Book book) {
        return book.getId();
    }
    
    // Метод для получения книги по ID
    @Override
    public Book getBookById(int id) {
        return bookMap.get(id);
    }
}