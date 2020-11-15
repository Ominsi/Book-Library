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
		System.out.println("Successfully added " + book.getDetails());
	}

	/**
	 * Removes a book from the list using title.
	 */
	public void removeBook(Book book){
		boolean searching = true;
		int index = 0;

		while(!books.isEmpty() && searching && index < books.size()){

			if (book.getDetails().equals(books.get(index).getDetails())){
				System.out.println("Successfully removed " + books.remove(index).getDetails());
				searching = false;
			}
			else{
				index ++;
			}

			if (searching){
				System.out.println("ERROR: No book found with given title/author. (Hint: Make Sure Capitalization is Correct)");
			}
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
}