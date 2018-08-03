package controlStatement;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 9, 8, 7};
        int[] array2 = {6, 5, 3, 7, 9};
        int[] array3=new int[array1.length+array2.length];
        int m = 0, n = 0;

        for (int i=0;i<array1.length;i++)
        {
           array3[i]=array1[i];

        }
    }
}
