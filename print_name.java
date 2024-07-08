package recursion;
//program to print name n time
public class print_name {
    //printing name recursively without base condition
    static void print_naame(){
        System.out.println("ankur shrivastav");
        print_naame();//function calling itself
    }
    public static void main(String[] args) {
        print_naame();//call of function
    }
}
