
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private String author;
    private int pageNumbers;
    
    public Book(String t, String a, int pageNum)
    {
        title = t;
        author = a;
        pageNumbers = pageNum;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setAuthor(String a)
    {
        author = a;
    }
    
    public void setPageNumbers(int pageNum)
    {
        pageNumbers = pageNum;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getPageNumber()
    {
        return pageNumbers;
    }
    
    public String toString()
    {
        String bookData = "Title: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + pageNumbers;
        return bookData;
        
    }
}
