package task2.task27;

public class BookTest {
    public static void main(String [] args){ // тестирование классов книжной полки и книги
        BookShelf books = new BookShelf();

        books.addBook("Bob Green", "Algorithm", 2011);
        books.addBook("Tomas", "Vladic", 1690);
        books.addBook("Miatlik", "Froge", 2045);
        books.addBook("Kentafaric", "Stalker", 2005);

        System.out.println(books.getBook(0).toString());
        books.getBook(0).setAuthor("Visliak");
        books.getBook(0).setName("Alcho");
        books.getBook(0).setDateOfCreation(2012);

        System.out.println(books.theNewest().toString());
        System.out.println(books.theOldest().toString());
        books.sortBooks();
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(books.getBook(i).toString());
        }

    }
}
