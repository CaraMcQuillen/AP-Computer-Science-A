import java.util.*;
/**
 * Write a description of class DeletionsEasyTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeletionsEasyTester
{
   public static void main (String[] args) 
   {
       ArrayList<Integer>tester = new ArrayList<>();
       
       tester.add(3);
       tester.add(5);
       tester.add(8);
       tester.add(0);
       tester.add(2);
       tester.add(5);
       tester.add(4);
       
       DeletionsEasy testerArray = new DeletionsEasy(tester); 
       System.out.print(testerArray.delete());
    }
}
