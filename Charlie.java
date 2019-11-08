
/**
 *
 *
 * @author Cara McQuillen
 *
 */
public class Charlie
{
    private double height;
    private String hairColor;
    private int age;
    
    /**
     * No-args constuctor
     */
    public Charlie()
    {
        height = 65;
        hairColor = "Rose Gold";
        age = 17;
    }
    
    /**
     * Constuctor will take three parameter variables
     * @param h height
     * @param hc hair color
     * @param a age
     */
    public Charlie(double h, String hc, int a)
    {
        height = h;
        hairColor = hc;
        age = a;
    }
    
    /**
     * Mutator method to change height
     * @param h new height
     */
    public void setHeight(double h)
    {
        height = h;
    }
        
    /**
     * Mutator method to change hair color
     * @param hc new hair color
     */
    public void setHairColor(String hc)
    {
        hairColor = hc;
    }
    
    /**
     * Mutator method to change age
     * @param a new age
     */
    public void setAge(int a)
    {
        age = a;
    }
    
    /**
     * Accessor method to get height
     * @return height
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * Accessor method to get hair color
     * @return hair color
     */
    public String getHairColor()
    {
        return hairColor;
    }
    
    /**
     * Accessor method to get age
     * @return age
     */
    public int getAge()
    {
        return age;
    }
    
    public String toString()
    {
        String charlieData = "Charlie's height: " + height;
        charlieData += "   Charlie's hair color: " + hairColor;
        charlieData += "   Charlie's age: "  + age;
        return charlieData;
    }
}
