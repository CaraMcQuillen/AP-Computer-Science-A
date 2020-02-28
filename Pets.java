
/**
 * Write a description of class Dogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pets
{
    private String name;
    private int age;
    public Pets (String n, int a)
    {
        name = n;
        age = a;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public String toString()
    {
        return "Name: " + name + " Age: " + age;
    }
}