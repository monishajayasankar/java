import java.util.*;
public class Canteencalculation {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("welcome to monisha canteen :) ");
        System.out.println("Menu items");
        System.out.println("1.briyani-100");
        System.out.println("2.chickenrice-80");
        System.out.println("3.sambarrice-50");
        System.out.println("enter the option");
        int option=in.nextInt();
        System.out.println("give  rupees: ");
        int amount=in.nextInt();
        switch(option){
            case 1: int briyani=amount-100;
            System.out.println("given rupees: "+amount);
            System.out.println("briyani:100");
            System.out.println("your balance: "+briyani);
            break;
            case 2: int chickenrice=amount-80;
            System.out.println("given rupees: "+amount);
            System.out.println("chickenrice:80");
            System.out.println("your balance: "+chickenrice);
            break;
            case 3: int sambarrice=amount-50;
            System.out.println("given rupees: "+amount);
            System.out.println("sambarrice:50");
            System.out.println("your balance: "+sambarrice);
            break;
        }
       
        
        
      
    }
}