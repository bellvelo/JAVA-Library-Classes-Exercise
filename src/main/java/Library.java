import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;
    private int capacity;


    public Library(int capacity) {
        this.library = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int getBookCount() {
        return this.library.size();
    }

    public void addBookToLibrary(Book book) {
        if (getBookCount() < capacity) {
            this.library.add(book);
        }
        getBookCount();
    }

    public void removeBookFromLibrary(Book book) {
        this.library.remove(book);
    }
}
