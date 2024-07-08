package recursion;
//program to find sum of first n number
import java.util.Scanner;

public class sum_of_nNumber {
    static void sum(int a ,int i){
        if (a<1){
        System.out.println(i);
         return ;
        }
        sum(a-1,i+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  number: ");
        int num=sc.nextInt();
        sum(num,0);
    }
}
