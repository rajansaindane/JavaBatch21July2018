package controlStatement;

public class Loops {

    public static void main(String[] args) {

        /*for (int i=0;i<5;i++)
        {
            System.out.println("i : "+i);
        }*/
        int i=0;
        while (i<5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("i = "+i);

        do {
            System.out.println("do while : "+i);
            i++;
        }while (i<5);
        System.out.println("i in do while : "+i);
    }

}
