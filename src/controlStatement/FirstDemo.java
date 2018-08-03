package controlStatement;

import java.util.Scanner;

public class FirstDemo {


     void showData(int a)
    {
        System.out.println("inside showData : "+a);
        System.out.println("inside showData : "+a);

    }

   static  void getData(int a)
    {
        new FirstDemo().showData(a);
    }

    public static void main(String[] args) {

        FirstDemo firstDemo=new FirstDemo();//instance of class
        Scanner scanner=new Scanner(System.in);
        getData(2);
      /*  firstDemo.getData(10);
        System.out.println("inside main");*/

    }


}
