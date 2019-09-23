
public class Classwork7
{
    public static void main(String[] args)
    {
        System.out.println(findSum(2, 3));
        System.out.println(canIVote(17));
       

        System.out.println(isRhysSick(100,"Yes"));
        
        
        
    }
    
    public static double findSum(int a, int b)
    {
        return a + b;
    }
    
    public static String canIVote(int age)
    {
        if (age>= 18)
            return "You can vote!";
        else 
            return "You can't vote!";
    }
    
    public static String isRhysSick(int a, String b)
    {
        if (a >= 10)
            { 
              if (b.equals("yes") || b.equals("Yes"))
                return "No you are not sick. Maybe you have asthma or it could just be allergies.";
              else 
                return "Yes you are sick";
            }
        else 
            return "No you are not sick";
                
     }
}
