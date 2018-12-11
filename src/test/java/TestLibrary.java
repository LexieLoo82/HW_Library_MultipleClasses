import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.JobImpressions;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Borrower borrower;



    @Before
    public void before(){
        library = new Library();
        book = new Book("LoTR", "JRR Tolkien", "Fantasy");
        book1 = new Book("James and the Giant Peach", "Roald Dhal", "Children");
        book2 = new Book("Neverwhere", "Neil Gaiman", "Fantasy");
        book3 = new Book("Encylopedia Britanica", "The Queen", "History");
        book4 = new Book("Jam Recipes", "Jimmy the Jam Maker", "Cooking");
        book5 = new Book("Forrest Gump", "Stephen King", "Fantasy");
        borrower = new Borrower("Jim");


    }

    @Test
    public void bookHasTitle(){
        assertEquals("LoTR", book.hasName());
    }

    //count Books in Library
    @Test
    public void libraryHasBooks(){
        assertEquals(0, library.countBooks());
    }

//can add book to library
    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(4, library.countBooks());
    }
//can't add past capacity.
    @Test
    public void libraryHasCapacity(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(5, library.countBooks());

    }

    @Test
    public void libraryCanLendBook(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook();
        assertEquals(2, library.countBooks());
    }



    @Test
    public void borrowerCanTakeFromLibrary(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowsBook(library);
        assertEquals(2, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }




}
