/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

import java.util.Calendar;

/**
 *
 * @author Ada
 */
public class NumbersMagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // declaring and initializating the variables
        double a = -191.635;
        double b = 43.74;
        int e = 16, d = 45;
// we can use format or printif instead of print or println
        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, Math.abs(a)); // 

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", 
                          b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                          e, d, Math.max(e, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          e, d, Math.min(e, d));
 
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                          Math.E);
        System.out.printf("exp(%.3f) " + "is %.3f%n",
                          x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                          x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                          x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                          x, Math.sqrt(x));
        
        int number = (int)(Math.random() * 10);

         long n = 461012;
      System.out.format("%d%n", n);    
      System.out.format("%08d%n", n);
      System.out.format("%+8d%n", n);
      System.out.format("%,8d%n", n);
      System.out.format("%+,8d%n%n", n);
      
      double pi = Math.PI;

      System.out.format("%f%n", pi);
      System.out.format("%.3f%n", pi);
      System.out.format("%10.3f%n", pi);
      System.out.format("%-10.3f%n", pi);

      Calendar c = Calendar.getInstance();
      
      System.out.format("%tB %te, %tY%n", c, c, c);

      System.out.format("%tl:%tM %tp%n", c, c, c);

      System.out.format("%tD%n", c);
      
    }
}
