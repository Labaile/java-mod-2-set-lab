
import java.util.HashMap;
import java.util.HashSet;
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

    //create a set that contains a list of each genre that you have a book for
    Set<String> uniqueBookGenre = new HashSet<String>();

    public HashMap<String, Book> getLibrary() {
        return library;
    }


    public void setLibrary(HashMap<String, Book> library) {
        this.library = library;
    }


    public Set<String> getUniqueBookGenre(Book bookFromUser) {
        return uniqueBookGenre;
    }


    public void setUniqueBookGenre(Set<String> uniqueBookGenre) {
        this.uniqueBookGenre = uniqueBookGenre;
    }

    
    
    }//close Library class



