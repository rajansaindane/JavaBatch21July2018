package arrayDemo;

public class TwoDArray {
     int j=2;

    void shwMatrix()
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

       /* int array1[][]=new int[3][3];
        array1[0][1]=1;*/

     /*  while (j>=0) {
           for (int i = 0; i <= 3; i++) {
               System.out.print(" " + array[i][j]);
               }
           j--;
           System.out.println();
       }*/
       for(int i=0;i<=3;i++)
       {
           for (int j=2;j>=0;j--)
           {
               System.out.print("  "+array[i][j]);
           }
           System.out.println();
       }
    }

    void showString()
    {
        String s="shwaeta";
        char[] arr=s.toCharArray();
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {

        new TwoDArray().shwMatrix();

    }
}
