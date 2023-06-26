public class Fibrec {
    public static void printfibo(int num,int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        if(num==0)
        {
            return;
        }
        else
        {
            printfibo(num-=1,a,b);
        }

    }

    public static void main(String[]args)
    {
        int num=7;
        int a=0,b=1,c=0;
        System.out.println(a+" "+b);
        int p=num-2;
        printfibo(p,a,b);
    }
}
