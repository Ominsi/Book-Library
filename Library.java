import java.util.ArrayList;
import java.util.Iterator;

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
		System.out.println("Successfully added " + book.getDetails());
		sortByTitle();
	}

	/**
	 * Removes a book from the list using title.
	 */
	public void removeBook(Book book){
		Iterator<Book> it = books.iterator();
		boolean searching = true;
		int index = 0;

		while(searching && it.hasNext()){
			Book currentBook = it.next();

			if (book.getDetails().equals(currentBook.getDetails())){
				System.out.println("Successfully removed " + currentBook.getDetails());
				it.remove();
				searching = false;
			}
			else{
				index ++;
			}
		}

		if (searching){
			System.out.println("ERROR: No book found with given title/author. (Hint: Make Sure Capitalization is Correct)");
		}
	}

	/**
	 * Prints all the books in the library.
	 */
	public void printBooks(){

		if (!books.isEmpty()){
			for (Book book : books){
				System.out.println(books.indexOf(book) + ".\t" + book.getDetails());
			}
		}

		else{
			System.out.println("No Books in The Library.");
		}
	}

	/**
	* Sorts the book list alphabetically based on the title.
	*/
	public void sortByTitle(){
		books.sort(new BookSorter());
	}
}