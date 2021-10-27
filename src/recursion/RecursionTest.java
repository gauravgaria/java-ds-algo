package recursion;

import java.util.Scanner;

public class RecursionTest {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        recursion(number);
    }

    public static void recursion(int n){
        if(n<1){
            System.out.println("n is " + n +" which less than 1");
        }else{
            System.out.println("n is " + n +" which greater than 1");
            recursion(n-1);
        }
    }
}
