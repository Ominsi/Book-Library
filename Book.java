import java.io.Serializable;

/**
* Class to represent books.
*/
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 466108618059152384L;
	private String title;
	private String author;

	/**
	* Constructor for objects of book class.
	*
	* @param title Title of book.
	* @param author Author of book.
	*/
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	/**
	* Returns the value of the field title.
	*
	*@return Title of the book.
	*/
	public String getTitle(){
		return title;
	}

	/**
	* Returns the value of the field author.
	*
	*@return Author of the book.
	*/
	public String getAuthor(){
		return author;
	}

	/**
	* Returns the title and author together as a string.
	*
	*@return Details of the book.
	*/
	public String getDetails(){
		return ("\"" + title + "\" By " + author);
	}
}