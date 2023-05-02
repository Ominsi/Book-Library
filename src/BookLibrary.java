import java.io.IOException;

public class BookLibrary{

	public static void main(String[] arg){
		Library myLibrary = new Library();
		try {
			myLibrary = SaveAndLoad.load();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		Menu mainMenu = new Menu(myLibrary);
		while (true){
			mainMenu.printMenu();
		}
		
	}
}