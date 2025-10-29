import javax.swing.*;
public class Fibonica 
{
      public static void main(String[] args)
      { 
         int f = 0, g = 1;
         int terms = Integer.parseInt(JOptionPane.showInputDialog("How many terms of the Fibonacci Sequence would you like to display?"));
         System.out.println("Fibonacci Sequence");
         for (int i = 1; i <= terms; i++)         
         {
            System.out.println(f);
            f = f + g;
            g = f - g;
         }
      }
   }
