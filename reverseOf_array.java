package recursion;
//program to reverse an array
import java.util.Scanner;

public class reverseOf_array {
    static int i=0;
    static void reverse(int[] array,int n){
        if(i>=n/2) return ;
        //swaping the number
        int tmp=array[i];
        array[i]=array[n-1-i];
        array[n-1-i]=tmp;
        i++;
        reverse(array, n);//function calling itself
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter the element of array");
        for(int i=0; i<size; i++){
          array[i]=sc.nextInt();
        }
        reverse(array,size);
        //printing the new array
        System.out.print("the reverse array is:");
        for (int i=0;i<size;i++)System.out.print(array[i]);
        
        
    }
}
