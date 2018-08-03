package controlStatement;

import java.util.Arrays;

public class ArraySorting {
    static int i=0;

    void showData()
    {
        int[] array={4,7,8,5,1,5,3};
        Arrays.sort(array);
        float f=(float) (array[array.length-1]+array[array.length-2])/2;
        System.out.println(f);
       // System.out.print(array[i]);
       /* if(i<array.length-1)
        {
            i++;
            showData();
        }*/
    }

    public static void main(String[] args) {
        new ArraySorting().showData();
    }

}
