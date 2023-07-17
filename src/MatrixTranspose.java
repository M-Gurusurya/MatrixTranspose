import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row size");
        int row_size=scanner.nextInt();
        System.out.println("enter column size");
        int column_size=scanner.nextInt();
        int array[][]=new int[row_size][column_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        findRowSum(array,row_size,column_size);
    }
    public static void findRowSum(int array[][],int row_size,int column_size)
    {
        int temp;
        int transpose[][]=new int[column_size][row_size];
        for(int i=0;i<column_size;i++)
        {
            for (int j=0;j<row_size;j++)
            {
                transpose[i][j]=array[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
