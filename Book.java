/*Write a Java program to create a class called "Book"
with attributes for title, author, and ISBN and methods
to add and remove books from a collection.*/

//PART_01
package oop_lab_work;

public class Book 
{ 
    private String title;
    private String author;
    private int ISBN;
    

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public int getISBN() 
    {
        return ISBN;
    }

    public void setISBN(int ISBN) 
    {
        this.ISBN = ISBN;
    }
    
}
