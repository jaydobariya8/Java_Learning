class library{
    String[] books;
    int noOfBooks;
    library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added....!");
    }
    void showAvailableBooks(){
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("--> " + book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("your book \"" + book + " \" has been issued...!");
                this.books[i] = null;
                return;
            }
            System.out.println("your book \"" + book + " \" is not avalible...!");
        }
    }
    void returnBook(String book){
        addBook(book);
    }
}


public class library_app{
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        library mylibrary = new library();
        mylibrary.addBook("Bhagvat Geetaji");
        mylibrary.addBook("mahabharat");
        mylibrary.showAvailableBooks();
        mylibrary.issueBook("mahabharat");
        mylibrary.showAvailableBooks();
        mylibrary.returnBook("mahabhrat");
        mylibrary.showAvailableBooks();
        mylibrary.issueBook("Bhagvat Geetaji");
        
        
    }
}
