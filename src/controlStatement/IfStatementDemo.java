package controlStatement;

import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("enter Number : ");
        int number=scanner.nextInt();

       if (number%2==0)
       {
           System.out.println("even number");
       }
       else
       {
           System.out.println("odd number");
       }

       int a=7;
       int b=12;
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a : "+a+" b: "+b);

    }
}
