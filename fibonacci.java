package recursion;
//program to print fibonacci series using recursion
import java.util.Scanner;

public class fibonacci {
    static int i=0,num1=0,num2=1,num3=0;
    static void fibona(int num){
        if (3>num){
           return;
        }
        num3=num1+num2;
        num1=num2;
        num2=num3;
        System.out.print(num3+" ");
        fibona(num-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number;");
        int num=sc.nextInt();;
        System.out.print(num1+" "+num2+" ");
        fibona(num);
    }
}
