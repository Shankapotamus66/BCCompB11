/**
* This class tests the CounterFromText class.
* @author      {user}
* Course:      COMP B11
* Created:     Apr 18, 2018
* Source File: Counter1Tester.java 
*/
public class Counter1Tester {
   public static void main(String[] args)
   {
      Counter1 tally = new Counter1();
      tally.count();
      tally.count();
      tally.count();
      int result = tally.getValue();
      System.out.println("Value: " + result);
      tally.reset();
      tally.count();
      tally.count();
      result = tally.getValue();
      System.out.println("Value: " + result);
   }
}
