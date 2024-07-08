package recursion;
//program to print 1 to N usingg recursion
import java.util.Scanner;

public class print_1TOn {
    static void print(int a,int b){//function of print number
        if(a>b){
            return;
        }
        System.out.print(a+" ");
        print(a+1,b);//function calling itself
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the starting an ending number respectively");
        int st=obj.nextInt();
        int end=obj.nextInt();
        print(st,end);//calling the function
    }
}
