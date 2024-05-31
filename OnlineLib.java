class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String [100];
        this.no_of_books =0;

    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available Books :");
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){
       for (int i = 0; i < this.books.length; i++) {
        if(this.books[i].equals(book)){
            System.out.println("Book has been issued");
            this.books[i] = null;
            return;
        }
    }
    System.out.println("Book doesn't exist");   
    }
    
    void returnBook(String book){
        this.books[no_of_books] = book;
            addBook(book);
    }
    
}


public class OnlineLib {
    public static void main(String[] args) {
        // Implement a lib using java CLass Library
        // Methods : issueBook(),returnBook(),showAvailableBooks()
        // Properties : Array to store the available books ,to store issued books 
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Mountains & Valleys");
        centralLibrary.addBook("Death Routes");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Mountains & Valleys");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Mountains & Valleys");
        centralLibrary.showAvailableBooks();
    }
}
