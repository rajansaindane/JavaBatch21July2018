package controlStatement;

import java.util.Scanner;

public class ElseIfDemo {

    void checkElseIF(int percentage)
    {
        if(percentage<35)
        {
            System.out.println("fail");
        }
        else if(percentage>=35  && percentage<60)
        {
            System.out.println("Higher second class");
        }
        else if(percentage>=60  && percentage<75)
        {
            System.out.println("First class");
        }
        else if(percentage>=75  && percentage<=100)
        {
            System.out.println("Distinction class");
        }
        else
        {
            System.out.println("Invalid");
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter percentage : ");
        int percentage=scanner.nextInt();
        new ElseIfDemo().checkElseIF(percentage);
    }

}
