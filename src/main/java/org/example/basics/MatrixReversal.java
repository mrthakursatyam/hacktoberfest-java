package org.example.basics;
import java.util.Scanner;
class MatrixReversal
{
    private int arr[][];
    private int m;
    private int n;
    public MatrixReversal(int mm, int nn)
    {
        m=mm;
        n = nn;
        arr=new int[m][n];
    }

    public void fillArray( )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements::");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public int reverse(int x)
    {
        int rev = 0;
        for(int i = x; i != 0; i /= 10)
            rev = rev * 10 + i % 10;
        return rev;
    }

    public void revMat(MatrixReversal p)
    {
        for(int i = 0; i < m; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                this.arr[i] [j] = reverse(p.arr[i] [j]);
            }
        }
    }

    public void show()
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out. print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows::");
        int x = sc.nextInt();
        System.out.print("Enter number of columns::");
        int y = sc.nextInt();
        MatrixReversal obj1 = new MatrixReversal(x, y);
        MatrixReversal obj2 = new MatrixReversal(x, y);
        obj1.fillArray();
        obj2.revMat(obj1);
        System.out.println("Original Matrix is::");
        obj1.show();
        System.out.println("Matrix with reversed elements");
        obj2.show();
    }
}
/* OUTPUT
 Enter number of rows::3
Enter number of columns::3
Enter matrix elements::
2
3
4
10
12
23
43
25
21
Original Matrix is::
2    3    4    
10    12    23    
43    25    21    
Matrix with reversed elements
2    3    4    
1    21    32    
34    52    12
*/