
package th.ac.nu.students.u54341802.compro.ch02;
import java.util.Scanner;
public class p12 {

    
    public  static  void  main(String [] args){
    
    double tank = 1; 
    double gas = 20.0;
    double price = 37.23;
    double gallon = 45.6;
    double mile = 0.13;   
    
    System.out.print("The number of gallons of gas in the ");
    Scanner  s = new Scanner(System.in);
    System.out.print("tank:");
    tank = s.nextDouble();
    System.out.println("gas/Lit:" + gas*tank);
    
    
    System.out.print("The fuel efficiency in miles per gallon:");
    mile = s.nextDouble();
    System.out.println("gallon/mile:" + mile * 1 /gallon);
    
    
    
    System.out.print("The price of gas per gallon:");
    gallon = s.nextDouble();
    System.out.println("price/gallon:" + price * tank);
    
        }

    }

