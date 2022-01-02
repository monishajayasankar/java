import java.util.Scanner;
public class Wishme{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the time: ");
        int n=in.nextInt();{
            if(n>=1 || n<=12){
                System.out.println("good morning");}
            else if(n>=12 || n<=16){
                System.out.println("good afternoon");}
            else if(n>=16 || n<=21){
                  System.out.println("good evening");}
            else{
              System.out.println("good night");
            }    
    }    
}
}