
/**
 * Write a description of class Movie here.
 *
 * @Cara McQuillen
 * @version (a version number or a date)
 */
public class Movie
{
  //instance variables are the adjectives to describe your object
  private String title;
  private String genre;
  private double lengthInMin;
  
  //constructor definition 
  public Movie(String titl, String gen, double len)
  {
      title = titl;
      genre = gen;
      lengthInMin = len;
    }
   
  //mutator method for changing private data
  public void setTitle(String t)
  {
    title = t;
    }
    
  // accessor method gor accessing the private data
  public String getTitle()
  {
    return title;
    }
  
  public void setGenre(String g)
  {
    genre = g;
    }
  
  public String getGenre()
  {
    return genre;
    }
    
  public void setLength(double l)
  {
    lengthInMin = l;
    }
    
  public double getLength()
  {
    return lengthInMin;
    }
}
