package controlStatement;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a=10;
        int b=++a;//b=11 a=11
        int c=(++b)+(a++);//c=23 b=12 a=12
        int d=(c++)+(a++)+(++b);//d=23+12+13=48 c=24 a=13 b=13
        System.out.println("a:"+a);//11
        System.out.println("b:"+b);//11
        System.out.println("c:"+c);//23
        System.out.println("d:"+d);//23
    }
}
