public class BookLibrary{

	public static void main(String[] arg){
		Library myLibrary = new Library();
		Menu mainMenu = new Menu(myLibrary);
		while (true){
			mainMenu.printMenu();
		}
		
	}
}