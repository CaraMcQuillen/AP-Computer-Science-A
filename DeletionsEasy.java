import java.util.*;
/**
 * Write a description of class DeletionsEasy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeletionsEasy
{
    ArrayList<Integer> numbers = new ArrayList<>();
    
    public DeletionsEasy (ArrayList<Integer> a)
    {
        numbers.addAll(a);
    }
    
    public int delete()
    {
       
        int count = 0;
        while(numbers.size()>0)
        {   for(int i = 0; i < numbers.size(); i++)
            {
                System.out.print(numbers.get(i));
                
            }
            System.out.println("");
            count ++;
            int index = 0;
            for(int i = 0; i < numbers.size(); i++)
            {
                if(numbers.get(i) == 0)
                index = i; 
            }
        
            for(int i = index; i >= 0; i--)
                numbers.remove(i);
        
            int max = 0;
            int maxLocation = 0;
            for(int i = 0; i < numbers.size(); i++) 
            {
                    if(numbers.get(i)>= max)
                    max = numbers.get(i);
                    maxLocation = i; 
            }
        
            if(max%2 == 0 && numbers.size()>0)
             numbers.set(maxLocation, max-2);
             
            else if(max%2 != 0 && numbers.size()>0)
              numbers.set(maxLocation, max -1);
            
                
            
               
            
            
        }
        return count; 
    }
    
    
    
}
