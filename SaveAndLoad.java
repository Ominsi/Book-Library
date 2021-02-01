import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class SaveAndLoad {
	
	public static void save(Library library) throws IOException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(library);
		oos.close();
	}
	
	public static Library load() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fin);
		Library library = (Library) ois.readObject();
		ois.close();
		return library;
	}
}
