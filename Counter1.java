/**
* This class simulates a counter used to count things
*
* @author 		{user}
* Course:		COMP B11
* Created:		Apr 18, 2018
* Source File:	Counter1.java 
*/
public class Counter1 {
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
   
   /**
    * Resets the count to 0
    */
   public void reset()
   {
	   value = 0;
   }
}
