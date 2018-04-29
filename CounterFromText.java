/**
* This class simulates a counter used to count things
*
* @author 		{user}
* Course:		COMP B11
* Created:		Apr 18, 2018
* Source File:	CounterFromText.java 
*/
public class CounterFromText {
   private int value;

   /**
    * Increment count by one
    */
   public void count()
   {
      value = value + 1;
   }

   /**
    * Returns the value
    * @return the value
    */
   public int getValue()
   {
      return value;
   }
}
