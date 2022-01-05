import java.util.Scanner;
public class Exponent{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base=in.nextInt();
        System.out.println("Enter the exponent number: ");
        int exponent=in.nextInt();
        System.out.println("Power("+base+"^"+exponent+") = "+power(base,exponent));
    }
static int power(int b,int e){
    if(e==0)
    return 1;
    else
       return (b*power(b,e-1));
    
}
    }
