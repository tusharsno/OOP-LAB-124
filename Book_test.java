//PART_03
package oop_lab_work;

public class Book_test 
{
    public static void main(String[] args) 
    {
        Book_Store book_store = new Book_Store();
        
        Book book_01 = new Book("Physics","Tushar",3434);
        Book book_02 = new Book("Chemistry","Snow",7856);
        Book book_03 = new Book("Biology","Tushar Barua",2342);
        Book book_04 = new Book("Math","Tushar Snow",2938);
        
        book_store.addBook(book_01);
        book_store.addBook(book_02);
        book_store.addBook(book_03);
        book_store.addBook(book_04);
        
        System.out.println("Book in the store: \n");
        book_store.getBook().forEach((book) -> 
        {
            System.out.println("BOOK:");
            System.out.println("1.Title: " + book.getTitle());
            System.out.println("2.Author: " + book.getAuthor());
            System.out.println("3.ISBN: " + book.getISBN());
            System.out.println(" ");
        });
        
        System.out.println("\n");
        book_store.removeBook(book_03);
        System.out.println("After removing a book in the store: "+book_03.getTitle() + "\n");
        
        book_store.removeBook(book_04);
        System.out.println("After removing a book in the store: "+book_04.getTitle() + "\n");
        
        book_store.getBook().forEach((book) -> 
        {
            System.out.println("BOOK: ");
            System.out.println("1.Title: " + book.getTitle());
            System.out.println("2.Author: " + book.getAuthor());
            System.out.println("3.ISBN: " + book.getISBN());
            System.out.println(" ");
        }); 
        
        System.out.println("\n");
    }
}

 
