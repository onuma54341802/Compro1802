
package th.ac.nu.students.u54341802.compro.ch3;
import java.util.Scanner;

public class P3_7 {

    public static void main(String[] args) {     
    Scanner in = new Scanner(System.in);

        System.out.print("Frequency :");
        double Frequency = in.nextDouble();

        
           if((Math.pow(10,9)*3)<Frequency){
           System.out.println("Radio Waves");
           
           }else if(Frequency>=Math.pow(10,11)*3){
           System.out.println("Microwaves");
           
           }else if(Frequency>=Math.pow(10,14)*4){
           System.out.println("Infared");
           
           }else if(Frequency>=Math.pow(10,14)*7.5){
           System.out.println("Visible light");
           
          }else if(Frequency>=Math.pow(10,16)*3){
          System.out.println("X-rays");
          
          }else if(Frequency>=Math.pow(10,19)*3){
          System.out.println("X-rays");
          
          }else{
          System.out.println("Grammar rays");
             }
         }
}
