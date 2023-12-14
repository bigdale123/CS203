package dylcal13_Lab09;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class BookStoreTest {

	private BookStore store;
	private Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
	private Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
	private Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
	private Book b4 = new Book(5, "J.K. Rowling","Harry Potter and the Sorcerer's Stone");
	private Book b5 = new Book(4, "Douglas Adams","The Hitchhiker's Guide to the Galaxy");



	/**
	 * setup the store
	 *
	 */
	@Before
	public void setUpBookStore() {
		store = new BookStore();
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);
		store.addBook(b5);

	}

	/**
	 * tests the addition of book
	 *
	 */

	@Test
	public void testAddBook() {
		store.addBook(b1);
		assertTrue(store.getBooks().contains(b1));

	}

	/**
	 * tests the deletion of book
	 *
	 */

	@Test
	public void testDeleteBook() {
		store.deleteBook(b1);
		assertFalse(store.getBooks().contains(b1));
	}

	/**
	 * tests sorting of books by author name
	 *
	 */

	@Test
	public void testGetBooksSortedByAuthor() {
		List<Book> yup = new ArrayList<Book>();
		yup.add(b5);
		yup.add(b3);
		yup.add(b1);
		yup.add(b2);
		yup.add(b4);
		assertTrue(store.getBooksSortedByAuthor().equals(yup));
	}

	/**
	 * tests sorting of books by title
	 *
	 */

	@Test
	public void testGetBooksSortedByTitle() {
		List<Book> yup = new ArrayList<Book>();
		yup.add(b4);
		yup.add(b5);
		yup.add(b3);
		yup.add(b1);
		yup.add(b2);
		assertTrue(store.getBooksSortedByTitle().equals(yup));
	}

	/**
	 * tests the number of copies of book in store
	 *
	 */

	@Test
	public void testCountBookWithTitle() {
		assertTrue(store.countBookWithTitle("To Kill a Mockingbird")==2);
		assertTrue(store.countBookWithTitle("The Secret Garden")==1);
		assertTrue(store.countBookWithTitle("Harry Potter and the Sorcerer's Stone")==1);
		assertTrue(store.countBookWithTitle("The Hitchhiker's Guide to the Galaxy")==1);
		
		
	}

}
