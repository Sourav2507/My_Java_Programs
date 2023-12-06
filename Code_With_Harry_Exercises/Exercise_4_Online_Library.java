package Code_With_Harry_Exercises;

import java.util.Scanner;

class Library{
    String [] Books = new String[10];
    int no_of_books = 0;

    public void addBook(String book){
        Books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been Successfully added to your Library! ");
    }

    public void issueBook(String book){
        for (int i =0;i<this.Books.length;i++){
            if (Books[i].equals(book)){
                System.out.println(book+" has been Issued");
                this.Books[i]=null;
                return;
            }
        }
        System.out.println("This book does not Exist");
    }

    void returnBook(String book){
        addBook(book);
    }

    public void showAvailableBooks(){

        System.out.println("\n\n Thus the list of available books in your library is : ");
        for (String element: Books){
            if (element==null){
                continue;
            }
            System.out.println("* "+element);
        }
    }

}

public class Exercise_4_Online_Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Select the Maximum books that can be contained in your Library : ");
        //short limit = sc.nextShort();


        Library online_library = new Library();

        online_library.addBook("Gulliver's Travells");
        online_library.addBook("Tale of two Cities");
        online_library.addBook("Programming with C");
        online_library.addBook("DSA in Java");
        online_library.addBook("Python Programming");
        online_library.addBook("Handbook on Web Development");

        online_library.showAvailableBooks();

        online_library.issueBook("DSA in Java");
        //online_library.issueBook("Advanced C++");

        online_library.showAvailableBooks();

        online_library.returnBook("DSA in Java");

        online_library.showAvailableBooks();
    }
}
