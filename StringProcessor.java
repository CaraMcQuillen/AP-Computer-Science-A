
public class StringProcessor 
{
    public static String withoutEnds(String str)
    {
        return str.substring(1,str.length()-1);
    }
    
    public static String front2(String str)
    {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    
    public static String firstFour(String str)
    {
        int length = str.length();
        if (length>=4)
            return str.substring(0,4);
        else if (length == 3)
            return str + "#";
        else if (length == 2)
            return str + "##";
        else if (length == 1)
            return str + "###";
        else 
            return "####";
     
    }
    
    public static boolean frontAgain(String str)
    {
        String firstTwo = str.substring(0,2).toLowerCase();
        String lastTwo = str.substring (str.length()-2).toLowerCase();
        
        if (firstTwo.equals(lastTwo))
            return true;
        else 
            return false;
      
       
    }
    
    
}
