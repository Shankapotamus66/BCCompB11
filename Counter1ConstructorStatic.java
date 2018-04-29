/**
* This class simulates a counter used to count things
*
* @author 		{user}
* Course:		COMP B11
* Created:		Apr 25, 2018
* Source File:	Counter1ConstructorStatic.java 
*/
public class Counter1ConstructorStatic {
   private int value;
   private static int counter;
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
   public Counter1ConstructorStatic(int counters) 
   {
	   value = counters;
	   counter++;
   }
   
   /**
    * Sets the initial value to 0.
    */
   public Counter1ConstructorStatic() 
   {
	   value = 0;
	   counter++;
   }
   /**
    * returns the amount of times the constructor is used.
    */
   public static int getNumCounters(){
	   return counter;
	 
   }
}
	
