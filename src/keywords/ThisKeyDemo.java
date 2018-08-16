package keywords;

public class ThisKeyDemo {

    int a,b;

    ThisKeyDemo(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("a : "+this.a+" b : "+this.b);
        addition();
    }

    ThisKeyDemo()
    {
        this(50,100);
        System.out.println("inside default constructor");
    }

    void sub()
    {
        int result=a-b;
        System.out.println("sub : "+result);
    }

    void addition()
    {
        int result=a+b;
        System.out.println(result);
        this.sub();
    }

    public static void main(String[] args) {

        ThisKeyDemo thisKeyDemo=new ThisKeyDemo();
    }

}
