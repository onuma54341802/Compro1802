package th.ac.nu.students.u54341802.compro.ch3;
import java.util.Scanner;
public class P3_22 {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
        System.out.println(n4);
        
        int i = 0; 
        while (i<n1) { 
        System.out.print("M");
        i = i + 1;
        }
        
        if(n2==5)
            System.out.print("D");
        else if(n2<5){
        int n = 0; 
        while (n<n2) { 
        System.out.print("C");
        n = n + 1;
        }}
        else if (n2>5){
        System.out.print("D");
        int n =0; 
        while (n<(n2-5)) { 
        System.out.print("C");
        n = n+1;
        }
        }
        
        if(n3==5)
            System.out.print("L");
        else if(n3<5){
        int n = 0; 
        while (n<n3) { 
        System.out.print("X");
        n = n + 1;
        }}
        else if (n3>5){
        System.out.print("L");
        int n =0; 
        while (n<(n3-5)) { 
        System.out.print("X");
        n = n+1;
        }
        }
        
        if(n4==1)
            System.out.println("I");
        else if(n4==2)
        {
            System.out.println("II");
        }
        else if(n4==3)
        {
            System.out.println("III");
        }
        else if(n4==4)
        {
            System.out.println("IV");
        }
        else if(n4==5)
        {
            System.out.println("V");
        }
        else if(n4==6)
        {
            System.out.println("VI");
        }
        else if(n4==7)
        {
            System.out.println("VII");
        }
        else if(n4==8)
        {
            System.out.println("VIII");
        }
        else if(n4==9){
            System.out.println("IX");
        
        }
        } 
    }
    

