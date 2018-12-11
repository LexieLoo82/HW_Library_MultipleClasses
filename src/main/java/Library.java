import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.capacity = 5;
        this.stock = new ArrayList<>();
    }


//check stock level
    public int countBooks(){
        return stock.size();
    }

//Add book, and check capacity first
    public void addBook(Book book) {
        if (capacity > stock.size()){
        stock.add(book);}
    }

    //remove book from library
    public Book removeBook() {
        return stock.remove(0);
    }




}
