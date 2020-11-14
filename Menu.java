import java.util.Scanner;

/**
* Class for Menus
*/
public class Menu{

	private Scanner scanner;
	private String[] menuItems; //Field menuItems of Array of String.
	private Library myLibrary;

	/**
	* Constructor method for menu objects.
	* Takes a library object to set myLibrary to library.
	*@param myLibrary Type of menu of Menu object.
	*/
	public Menu(Library myLibrary){
		scanner = new Scanner(System.in);
		this.myLibrary = myLibrary;
		setMenuItems();
	}

	/**
	* Sets menu items to the correct items.
	*/
	public void setMenuItems(){
		menuItems = new String[] {"View Books",
								  "Add Book",
								  "Remove Book",
								  "Quit"};
		printMenu();
	}

	/**
	* Prints all menu items as a list.
	*/
	public void printMenu(){
		for (int i = 0; i < menuItems.length; i++){
			System.out.println((i+1) + ". " + menuItems[i]);
		}
		takeInput();
	}

	/**
	* Takes an input from the user.
	* Then fulfills choice.
	*/
	public void takeInput(){
		boolean isValid = false;

		while (!isValid){
			System.out.println("Enter (1" + "-" + menuItems.length + ") Choice");
			String userInput = scanner.nextLine();
			System.out.println(userInput);

			switch (userInput){
				case "1":
					myLibrary.printBooks();
					isValid = true;
					break;
				case "2":
					addBook();
					isValid = true;
					break;
				case "3":
					removeBook();
					isValid = true;
					break;
				case "4":
					isValid = true;
					break;
				default:
					System.out.println("ERROR: Invalid Input");
					break;
			}
		}
	}

	/**
	 * Menu for adding book.
	 * 
	 * @return Book object to be added.
	 */
	public Book addBook(){
		Book book = new Book("title", "author");
		return book;
	}

	/**
	 * Menu for removing book.

	 * @return Book object to be removed.
	 */
	public Book removeBook(){
		Book book = new Book("title", "author");
		return book;

	}
}