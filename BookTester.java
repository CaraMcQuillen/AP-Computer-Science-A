
/**
 * Write a description of class BookTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Old Man and the Sea", "Ernest Hemingway", 345);
        Book b2 = new Book("The Highly Sensitive Person", "Elaine Aron", 200);
        
        System.out.println(b1);
        System.out.println(b2);
        
        b1.setTitle("Hello");
        System.out.println(b1.getTitle());
        b1.setAuthor("Rhys Colman");
        System.out.println(b1.getAuthor());
        b1.setPageNumbers(2);
        System.out.println(b1.getPageNumbers());
        
    }
}
