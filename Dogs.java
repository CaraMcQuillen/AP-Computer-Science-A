
public class Dogs extends Pets
{
    private String breed;
    
    public Dogs (String n, int a, String b)
    {
        super(n,a);
        breed = b;
    }
    
    public String toString()
    {
        return super.toString() + " Breed: " + breed;
    }
    
}
