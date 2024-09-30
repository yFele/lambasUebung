package NumberTester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTester implements NumberTest {

   private NumberTest oddTester;
   private NumberTest primeTester;
   private NumberTest palindromeTester;

   //---------------------------------------
   List<Integer> firstNumberList = new ArrayList<>();
   List<Integer> secondNumberList = new ArrayList<>();

   private final String fileName;


   public NumberTester(String fileName) {
      this.fileName = "text.csv";
   }

   public void setOddEvenTester(NumberTest oddTester) {
      this.oddTester = oddTester;
   }

   public void setPrimeTester(NumberTest primeTester) {
      this.primeTester = primeTester;
   }

   public void setPalindromeTester(NumberTest palindromeTester) {
      this.palindromeTester = palindromeTester;
   }

   public void testFile() {

      try {
         Scanner s = new Scanner(new File(fileName));
         int casesToTest = Integer.parseInt(s.next());
         for (int i = 0; i <= casesToTest; i++) {
            String line = s.nextLine();
            String[] split = line.split(" ");
            switch (split[0]) {
               case "1":
                  System.out.println(oddTester.testNumber(Integer.parseInt(split[1])) ? "EVEN" : "ODD");
                  break;
               case "2":
                  System.out.println(primeTester.testNumber(Integer.parseInt(split[1])) ? "PRIME" : "NO PRIME");
                  break;
               case "3":
                  System.out.println(palindromeTester.testNumber(Integer.parseInt(split[1]))? "PALINDROM" : "NO PALINDROM");
                  break;
            }
         }
      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      }




      }


      @Override
      public boolean testNumber ( int number){
         return false;
      }


   }






