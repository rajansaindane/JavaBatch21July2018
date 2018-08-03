package controlStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }

    int result;
    void switchDemo(int a,int b,int choice)
    {
        int result=0;
        switch (choice)
        {

            case 1:
               // result=a+b;
                if(add(a,b)%2==0)
                {System.out.println("addition : "+add(a,b));}
                else
                {
                    System.out.println("odd number");
                }

                break;

            case 2:
               // result=a-b;
                System.out.println("subtraction : "+sub(a,b));
                break;

            case 3:
                result=a*b;
                System.out.println("multiplication : "+result);
                break;

            case 4:
                result=a/b;
                System.out.println("division : "+result);
                break;

                default:
                    System.out.println("Invalid choice");
        }

    }

    public static void main(String[] args) {
        SwitchCaseDemo switchCaseDemo=new SwitchCaseDemo();
        System.out.println("1. Add\n2. sub\n3. mul\n4. div");
        System.out.print("enter the choice : ");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        if(choice>4)
        {
            System.out.println("Invalid choice");
        }
        else
        {
            System.out.print("enter the value of a and b : ");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            switchCaseDemo.switchDemo(a,b,choice);
;
        }

    }

}
