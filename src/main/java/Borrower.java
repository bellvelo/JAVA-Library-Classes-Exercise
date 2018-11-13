import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrower;

    public Borrower(){
        this.borrower = new ArrayList<Book>();
    }

    public int getBorrowerBookCount() {
        return this.borrower.size();
    }

    public void rentBook(Book book) {
        this.borrower.add(book);
    }
}
