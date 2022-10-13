import java.util.ArrayList;

/*
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}
public class Library_Management_System {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("Linear Algebra", "Watson Cris");
        bk.add(b1);

        Book b2 = new Book("Computer Networks", "Albert Horton");
        bk.add(b2);

        Book b3 = new Book("Internet Programming", "James Gosling");
        bk.add(b3);

        Book b4 = new Book("Information System", "Peter Venn");
        bk.add(b4);

        MyLibrary lib = new MyLibrary(bk);
        lib.addBook(new Book("BookName", "AuthorName"));
        System.out.println(lib.books);
        lib.issueBook(b3, "Fakhar Zaman");
        System.out.println(lib.books);
    }
}