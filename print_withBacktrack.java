package recursion;
import java.util.Scanner;
// program to print from n to 1 without using n-1 (by using backktrack)
public class print_withBacktrack {
    //function to print number
    static void print_Nto1(int a,int b){
        if(a>b)
        return;
        print_Nto1(a+1,b);
        System.out.print(a+" ");//self calling
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number(largest and  smallest respectively)");
        int largest= sc.nextInt();
        int smallest=sc.nextInt();
        print_Nto1(smallest, largest);//calling function
        
    }
    
}
