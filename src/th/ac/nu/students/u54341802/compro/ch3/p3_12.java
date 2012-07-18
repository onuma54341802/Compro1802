
package th.ac.nu.students.u54341802.compro.ch3;
import java.util.Scanner;
public class p3_12 {

    public static void main(String[] args) {
 
     Scanner in = new Scanner(System.in);
     System.out.print("month number =");
  
     {
     int month =in.nextInt();
     
     if (month==1 ||month==2 || month==3)
     {
        System.out.println("Season=  winter"); 
     } 
     else if (month==4  || month ==5||month==6)
     {   
        System.out.println("Season= Spring");
     }   
     else if (month==7  || month ==8||month==9)
     {
        System.out.println("Season= Summer");
     }  
     else if (month==10  || month ==11||month==12)
     {   
        System.out.println("Season= Fall");
     }   
     
        }   
    }
}
     
