/**
* This class tests the CounterFromText class.
* @author      {user}
* Course:      COMP B11
* Created:     Apr 18, 2018
* Source File: CounterFromTextTester.java 
*/
public class CounterFromTextTester {
   public static void main(String[] args)
   {
      CounterFromText tally = new CounterFromText();
      tally.count();
      tally.count();
      tally.count();
      int result = tally.getValue();
      System.out.println("Value: " + result);
      tally.count();
      tally.count();
      result = tally.getValue();
      System.out.println("Value: " + result);
   }
}
