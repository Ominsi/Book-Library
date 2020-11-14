import java.util.ArrayList;

/**
 * Class for the library.
 */
public class Library{

	private ArrayList<Book> books;

	/**
	 * Constructor for objects of Library class.
	 */
	public Library(){
		books = new ArrayList<Book>();
	}

	/**
	 * Adds a new book to the list books.
	 *
	 *@param book Book to be added.
	 */
	public void addBook(Book book){
		books.add(book);
	}

	/**
	 * Removes a book from the list using title.
	 */
	public void removeBook(String title){
	}

	/**
	 * Removes a book from the list using index.
	 */
	public void removeBook(int index){
	}

	/**
	 * Prints all the books in the library.
	 */
	public void printBooks(){
		for (Book book : books){
			System.out.println("\t" + book.getDetails());
		}
	}
}