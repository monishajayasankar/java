import java.util.Scanner;
public class Numberprinting {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the starting number: ");
      int s=in.nextInt();
      System.out.println("Enter the ending number: ");
      int e=in.nextInt();
      for(int i=s;i<=e;i++){
          System.out.println(i);
      }
      
    }
}