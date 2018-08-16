package constructor;

import java.util.Scanner;

public class ConstructorDemo {

    int a,b,result;

    int add()
    {
        a=10;
        b=20;
        result=a+b;
        return result;
    }

  /*  ConstructorDemo(int a)
    {
        if(a%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }*/

  ConstructorDemo()
  {
      System.out.println("inside default constructor");
  }
    public static void main(String[] args) {
       /* System.out.print("enter number : ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();*/
        ConstructorDemo constructorDemo=new ConstructorDemo();
    }

}
