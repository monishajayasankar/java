import java.util.Scanner;
public class Calsi {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Press the below option specified");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.modulo");
        Scanner in=new Scanner(System.in);
        int option=in.nextInt();
        System.out.println("Enter the number a: ");
        int a=in.nextInt();
        System.out.println("Enter the number b: ");
        int b=in.nextInt();
        switch(option){
            case 1:int result=a+b;
            System.out.println("Addition is: "+result);
            break;
            case 2:int result1=a-b;
            System.out.println("Substraction is: "+result1);
            break;
            case 3:int result2=a*b;
            System.out.println("Multiplication is: "+result2);
            break;
            case 4:int result3=a/b;
            System.out.println("Division is: "+result3);
            break;
            case 5:int result4=a%b;
            System.out.println("modulo is: "+result4);
            break;
        }
        
    }
}