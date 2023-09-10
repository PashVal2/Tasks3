package task2.task27;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book>books;
    private int numberOfBooks;

    public Book theOldest(){
        Book theOldest = books.get(0);
        for(Book book:books){
            if(theOldest.getDateOfCreation() > book.getDateOfCreation()){
                theOldest = book;
            }
        }
        return theOldest;
    }
    public Book theNewest() {
        Book theNewest = books.get(0);
        for (Book book : books) {
            if (theNewest.getDateOfCreation() < book.getDateOfCreation()) {
                theNewest = book;
            }
        }
        return theNewest;
    }
}
