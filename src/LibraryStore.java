public class LibraryStore {
    public static void main(String[] args) {

    }
}

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ "has been added!");

    }
}
