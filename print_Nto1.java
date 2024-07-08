package recursion;
//program to print number fromm N to 1
import java.util.Scanner;
public class print_Nto1 {
    static void print(int a,int b){//function to print number
        if (a<b){
            return;
        }
        System.out.print(a+" ");
        print(a-1,b);//function calling itself
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter then range of number to be printed(largest and smallest respectively)");
        int largest=sc.nextInt();
        int smallest=sc.nextInt();
        print(largest,smallest);//function calling
    }
    
}
