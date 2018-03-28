import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
/*
 * SD2x Homework #8
 * This class represents the Logic Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

public class LogicTier {
    
    private DataTier dataTier; // link to the Data Tier
	
	public LogicTier(DataTier dataTier) {
		this.dataTier = dataTier;
	}
	
	public List<String> findBookTitlesByAuthor(String author) {
	    if (author == null || (author.equals(""))) {
	        return null;
	    }
            List<Book> books = dataTier.getAllBooks();
            List<String> booksByAuthor = new ArrayList<>();
            
            for (Book book: books) {
                if (book.getAuthor().contains(author.toLowerCase())) {
                    booksByAuthor.add(book.getTitle());
                }
            }
            return booksByAuthor;
	}
}
