package recursion;
//program to check if the given string is palindrome or not
import java.util.Scanner;

public class palindrome_string {
    static int i;
    static void palindrome(int i,String n){
        if(i>=n.length()){//base condition
            System.out.println("the string is palindrome");
            return;
        }
         //checking for palindrome string
        if(n.charAt(i)!=n.charAt(n.length()-1-i)){
            System.out.println("this is not a palindrome String");
            return;
        }
        palindrome(i+1,n);//function calling itself

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the word :");
        String s=sc.next();
        palindrome(0,s);//calling the function
    }
    
}
