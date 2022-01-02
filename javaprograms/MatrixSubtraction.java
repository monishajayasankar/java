import java.util.Scanner;
public class MatrixSubtractionDemo
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("moni enter number of rows : ");
      int row = sc.nextInt();
      System.out.println("moni enter number of columns : ");
      int col = sc.nextInt();
      int[][] x = new int[row][col];
      int[][] y = new int[row][col];
      System.out.println("moni enter first matrix - ");
      for(int m = 0; m < row; m++)
      {
         for(int s = 0; s < col; s++)
         {
            x[m][s] = sc.nextInt();
         }
      }
      System.out.println("moni enter second matrix - ");
      for(int m = 0; m < row; m++)
      {
         for(int s = 0; s < col; s++)
         {
            y[m][s] = sc.nextInt();
         }
      }
      int[][] z = new int[row][col];
      for(int m = 0; m < row; m++)
      {
         for(int s = 0; s < col; s++)
         {
            
            z[m][s] = x[m][s] + y[m][s];
         }
      }
      System.out.println("The subtraction of two matrices is - ");
      for(int m = 0; m < row; m++)
      {
         for(int s = 0; s < col; s++)
         {
            System.out.print(z[m][s] + " ");
         }
         System.out.println();
      }
      sc.close();
   }
}
