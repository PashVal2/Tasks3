package task2.task27;

public class BookTest {
    public static void main(String [] args){
        Book book = new Book("Bob Green", "Algorithm", 2011);
        System.out.println(book.toString());
        book.setAuthor("Tom Grey");
        book.setName("New world");
        book.setDateOfCreation(2022);
        System.out.println(book.toString());
    }
}
