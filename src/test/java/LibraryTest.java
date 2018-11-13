import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(200);
        book = new Book("1984", "George Orwell", "Fiction");
    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBookToLibrary(book);
        assertEquals(1, library.getBookCount());

    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.addBookToLibrary(book);
        library.removeBookFromLibrary(book);
        assertEquals(0, library.getBookCount());

    }

    @Test
    public void cantAddBookToLibrary() {
        int books = 201;
        for(int i=0;i<books;i++){
            library.addBookToLibrary(book);
        }
        assertEquals(200, library.getBookCount());
    }
}
