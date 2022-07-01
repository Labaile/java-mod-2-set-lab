
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Library {
    // library class to simply hold books
    HashMap<String, Book> library = new HashMap<String, Book>();

    public void addBook(Book bookToAdd) {
        // add to library
        library.put(bookToAdd.getTitle(), bookToAdd);
    }

    
    public Book getBook(String searchedForTitle) {
        //remove from library
        return library.get(searchedForTitle);
        
    }



    public HashMap<String, Book> getLibrary() {
        return library;
    }


    public void setLibrary(HashMap<String, Book> library) {
        this.library = library;
    }


    Set<String> bookGenres = new HashSet<String>();

    public boolean addGenre(String genre) {
        if (!bookGenres.contains(genre.toLowerCase())) {
            bookGenres.add(genre.toLowerCase());
            return true;
        } else {
            return false;
        }
    }

    public boolean containsGenre(String genre) {
        return bookGenres.contains(genre.toLowerCase());
    }
    
    }//close Library class



