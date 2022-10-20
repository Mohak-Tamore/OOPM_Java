import java.util.Scanner;
class ArrayAdd
{
    public static void main(String args[])
    {
        int row,column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        row = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        column = sc.nextInt();
        int A[][] = new int[row][column];
        int B[][] = new int[row][column];
        System.out.println("Enter elements for 1st matrix: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for 2nd matrix: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }  
        System.out.println("Matrix A: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                A[i][j] += B[i][j];
            }
        }  
        System.out.println("Matrix B: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sum: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}