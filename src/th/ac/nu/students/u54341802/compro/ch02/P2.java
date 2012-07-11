
package th.ac.nu.students.u54341802.compro.ch02;
import java.util.Scanner;
public class P2 {

    public static void main(String[] args) {
     //int x;
     
     Scanner in = new Scanner(System.in);
     System.out.print("Number = ");
     int x= in.nextInt();
    
     //int y;
     //Scanner in = new Scanner(System.in);
     System.out.print("Number = ");
     int y= in.nextInt();
  
     System.out.println("Sum = "    +(x+y));
     System.out.println("Difference = "    +(x-y));
     System.out.println("Product = "    +(x*y));
     System.out.println("Average = "    +(x+y)/2);
     System.out.println("Distance = "    +(-(x-y)));
     if (x>y)
     System.out.println("Max = "    + x);
     else
     System.out.println("Max = "    + y);  
      if (x>y)
     System.out.println("Min = "    + y);
     else
     System.out.println("Min = "    + x); 
    }
}
