import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int countBooks(){
        return collection.size();
    }

    //Extension, borrower can borrow book.
    public void borrowsBook(Library library) {
        Book book = library.removeBook();
        collection.add(book);
    }


}
