import java.util.Scanner;
public class Classwork5
{
   public static void main(String[] args)
   {
       //Exercise 1 
       /*for(int i = 0; i < 50; i += 1)
       {
           double randNum = (int)(Math.random()*6 + 1);
           System.out.println("You just rolled a:" + randNum);
           
       }
       */
      
      // Exercise 2 
      /* double diceRoll = (int)(Math.random() * 6 + 1);
      double diceRoll2 = (int)(Math.random() * 6 + 1);
      
      double diceSum = diceRoll + diceRoll2;
      System.out.println("You just rolled sum of " + diceSum);
      
      if (diceSum == 2 || diceSum == 3 || diceSum == 12)
        System.out.println("You lose!");
      else if (diceSum == 7 || diceSum == 11)
        System.out.println ("Yay! You win!");
      else 
        System.out.println("Keep playing!");
      */
     
      //Exercise 3
      /*
      System.out.println("Ask me a question:");
      Scanner scan = new Scanner(System.in);
      String question = scan.nextLine();
      
      double answer = (int) (Math.random() * 7);
      
      if(answer == 0)
        System.out.println("You may never know");
      else if (answer == 1)
        System.out.println("Odds aren't looking too good");
      else if (answer == 2)
        System.out.println("That's a ridiculous question. Please ask me something else.");
      else if (answer == 3)
        System.out.println("Well, it's a possibility ");
      else if (answer == 4)
        System.out.println("I am tired, come back later");
      else if (answer == 5)
        System.out.println("50/50 chance");
      else if (answer == 6)
        System.out.println("If you ask again nicely");
      */
     
     //Exercise 4
     /*
     System.out.println("How many sides do you want your dice to have?");
     Scanner scan = new Scanner(System.in);
     int sides = scan.nextInt();
     double diceRoll = (int)(Math.random() * sides + 1);
     if(sides < 1)
        System.out.println("Invalid entry");
     else
        System.out.println("Your program just rolled a " + diceRoll);
     */
     
     //Exercise 5
     
     Scanner scan = new Scanner(System.in);
     int number = (int)(Math.random() * 10 + 1);
     
     System.out.println("Guess a number between 1 and 10");
     int userGuess = scan.nextInt();
     

    for (int counter = 0; counter <3; counter +=1) 
     {
     if(userGuess == number)
        {System.out.println("You win!");
         break;
        }
     else if(userGuess < number)
        {
            System.out.println("Too low");
            System.out.println("Guess again");
            userGuess = scan.nextInt();
        }
     else if (userGuess < number)
        {
            System.out.println("Too high");
            System.out.println("Guess again");
            userGuess = scan.nextInt();
        } 
    }  
       
}
}

