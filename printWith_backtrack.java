package recursion;
//program to print 1 to N numbet without using "a+1" (by backtrack)
import java.util.Scanner;
public class printWith_backtrack {
    //function to print number
    static void print_num(int a,int b){
        if(a<b)
            return;
        print_num(a-1,b);//function calling itself before print statement
        System.out.print(a+" ");

    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println(" enter the range (like startin no. and endng no. respectively)");
    int start=sc.nextInt();
    int end= sc.nextInt();
    print_num(end,start);//function calling
}
    
}
