
 class Book {
     static int totalNoofBook;
     String author;
     String title;
     String isbn;
     boolean isBorrowed;

     static {
         totalNoofBook=0;

     }
     {
         totalNoofBook++;
     }
     Book(String isbn, String title, String author){
         this.isbn = isbn;
         this.title = title;
         this.author =  author;

     }
     Book(String isbn){
         this(isbn, "Unknown", "Unknown");
     }
     static int getTotalNoofBooks() {
         return totalNoofBook;
     }
     void borrowBook() {
         if (isBorrowed){
             System.out.println("Book is already borrowed");
         }
         else {
             this.isBorrowed = true;
             System.out.println("Enjoy the "+ this.title);
         }
     }
     void returnBook() {
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review");
        }
        else {
            System.out.println("This book is already in the library");
        }
     }

     public static void main(String[] args) {
         Book designOfThings = new Book("1", "Design", "Author");
         Book mybook = new Book("2");
         System.out.println(Book.getTotalNoofBooks());
         designOfThings.borrowBook();
         mybook.borrowBook();
         designOfThings.borrowBook();
         designOfThings.returnBook();
         designOfThings.returnBook();

     }


}


