package dz4;

public interface BookRepository {
    // Метод для сохранения книги
    void saveBook(Book book);
    
    // Метод для получения ID книги
    int getId(Book book);
    
    // Метод для получения книги по ID
    Book getBookById(int id);
}