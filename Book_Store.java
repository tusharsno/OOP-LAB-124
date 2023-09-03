//PART_02
package oop_lab_work;

import java.util.ArrayList;

public class Book_Store 
{
    public ArrayList <Book> books = new ArrayList < > ();
 
    //book_add
    public void addBook(Book book) 
    {
        books.add(book);
    }
    
    //book_remove
    public void removeBook(Book book) 
    {
        books.remove(book);
    }
    
    //get book
    public ArrayList < Book > getBook() 
    {
       return books;
    }
}

 