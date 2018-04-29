/**
* This class simulates a counter used to count things
*
* @author 		{user}
* Course:		COMP B11
* Created:		Apr 23, 2018
* Source File:	Counter1Constructor.java 
*/
public class Counter1Constructor {
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
   
   /**
    * Sets the initial value is the parameter inputed.
    */
   public Counter1Constructor(int counters) 
   {
	   value = counters;
   }
   
   /**
    * Sets the initial value to 0.
    */
   public Counter1Constructor() 
   {
	   value = 0;
   }
}
