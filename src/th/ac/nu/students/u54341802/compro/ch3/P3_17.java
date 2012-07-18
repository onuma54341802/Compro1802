
package th.ac.nu.students.u54341802.compro.ch3;
import java.util.Scanner;
public class P3_17 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter Income:");
        int x = in.nextInt();
        if(x <= 50000){
            System.out.print("Tax = "+x*0.01);
            }else{
        if((x > 50000)&&(x <= 75000)){
            System.out.print("Tax = "+x*0.02);
            }else{
        if((x > 75000)&&(x <= 100000)){  
            System.out.print("Tax = "+x*0.03);
            }else{
        if((x > 100000)&&(x <= 250000)){  
            System.out.print("Tax = "+x*0.04);
            }else{
        if((x > 250000)&&(x <= 500000)){  
            System.out.print("Tax = "+x*0.05);
            }else{
        if(x > 500000){  
            System.out.print("Tax = "+x*0.06);
        }}}}}}}}


