import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //int i = 0;
            System.out.println("Select 1: to add a book");
            System.out.println("Select 2: to look up an existing book");
            System.out.println("Select 3: to check if genre is present");
            System.out.print("Option: ");
            String user = scanner.nextLine();

            if (user.equals("1")) {
                //call method to add book
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Enter genre; ");
                String genre = scanner.nextLine();
                library.addGenre(genre);
                System.out.println("Enter number of pages; ");
                String numOfPages = scanner.nextLine();
                Book bookFromUser = new Book(title, genre, numOfPages);
                library.addBook(bookFromUser);
            } else if (user.equals("2")) {
                //call method to look book
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Your book is " + library.getBook(title));
            } else if (user.equals("3")) {
                System.out.print("Enter genre to search: ");
                String getUserGenre = scanner.nextLine();
                if (library.containsGenre(getUserGenre)) {
                    System.out.println(getUserGenre + " is present at this library.");
                } else {
                    System.out.println(getUserGenre + " is not present at this library");
                }
            }

            System.out.println("Do you want to continue: Y or N");
            String user1 = scanner.nextLine();
            if (Objects.equals(user1, "N"))
                break;
        }

    }//close main method

}//close main class
