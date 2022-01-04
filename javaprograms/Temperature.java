import java.util.*;
public class Temperature{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("1.celsius to fahrenheit 2.fahrenheit to celsius");
        System.out.println("enter the temperature coversion option: ");
        int option=in.nextInt();
        System.out.println("enter the degree");
        int degree=in.nextInt();
        switch(option){
            case 1:int output=degree*9/5+32;
            System.out.println("celsius to fahrenheit is:"+output);
            break;
            case 2:int result=(degree-32)*5/9;
            System.out.println("fahrenheit to celsius is:"+result);
            break;    
        }
      
      
      
    }
}