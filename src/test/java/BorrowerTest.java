import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(200);
        book = new Book("1984", "George Orwell", "Fiction");
        borrower = new Borrower();
    }

    @Test
    public void canGetBorrowerBookCount(){
        assertEquals(0, borrower.getBorrowerBookCount());
    }

    @Test
    public void canRentBookFromLibrary() {
        borrower.rentBook(book);
        assertEquals(1, borrower.getBorrowerBookCount());
    }
}



