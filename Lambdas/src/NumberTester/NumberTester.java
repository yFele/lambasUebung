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
   List<Integer> firstNumberList= new ArrayList<>();
   List<Integer> secondNumberList= new ArrayList<>();



   public NumberTester(String fileName){
      fileName="text.csv";

      try {
         Scanner scanner = new Scanner(new File(fileName));
         scanner.useDelimiter("\n");
         while (scanner.hasNext()) {
            String s = scanner.next();
            String[] numbers = s.split(" ");
            for (int i = 0; i <numbers.length; i++) {

               if (i % 2 ==0){
                  firstNumberList.add(Integer.valueOf(numbers[i]));
               }

               if (i % 2 ==1){
                  secondNumberList.add(Integer.valueOf(numbers[i]));
               }
            }
         }

      } catch (FileNotFoundException ex) {

      }

   }

   public void setOddEvenTester(NumberTest oddTester){
      this.oddTester=oddTester;
   }

   public void setPrimeTester(NumberTest primeTester){
      this.primeTester= primeTester;
   }

   public void setPalindromeTester(NumberTest palindromeTester){
      this.palindromeTester= palindromeTester;
   }

   public void testFile(){

   }


   @Override
   public boolean testNumber(int number) {
         return false;
   }



}
