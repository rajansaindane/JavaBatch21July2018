package controlStatement;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 9, 8, 7};
        int[] array2 = {6, 5, 3, 7, 9};
        int[] array3=new int[array1.length+array2.length];
        int m = 0, n = 0;

       for (int i=0;i<array1.length;i++)
       {
           for (int j=0;j<array2.length;j++)
           {

               if(array1[i]==array2[j])
               {
                   System.out.println(array1[i]);
                   array3[i]=array1[i];
               }

           }
       }

    }
}
