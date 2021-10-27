package recursion;

import java.util.Scanner;

public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
       /* System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        recursionTest.recursion(number);*/
        System.out.println("2 power 6 is using recursion " +recursionTest.powerUsingRecursion(6));
        System.out.println("2 power 6 is using iteration " + recursionTest.powerUsingIteration(6));
        System.out.println("factorial of 4 is " + recursionTest.factorial(4));
        System.out.println("fibonacci of 4 is " + recursionTest.fibonacci(4));
    }

    public void recursion(int n){
        if(n<1){
            System.out.println("n is " + n +" which less than 1");
        }else{
            System.out.println("n is " + n +" which greater than 1");
            recursion(n-1);
        }
    }

    /** Recursion is based on if condition
     *  1) each time function recursion is called
     *  2) makes code easy but is less time and space(memo) efficient
     *  **/

    public int powerUsingRecursion(int n){
        if(n==0){
            return 1;
        }else{
            int power = 2 * powerUsingRecursion(n-1);
            return power;
        }
    }

    /** Iteration is based on loop condition
     *  1) each time loop condition is checked
     *  2) makes code bit lengthy but is more time and space(memo) efficient
     * **/

    public int powerUsingIteration(int n){
        int i = 0;
        int power = 1;
        while(i<n){
            power = 2 * power;
            i++;
        }
        return power;
    }


    /**             3 Steps recursion
     *    1) examine recursive case(problem to be solved)
     *    2) base case condition(refrain from endless loop)
     *    3) unintentional values as input
     * */

    public int factorial(int n){
        if(n<0)                             //--> unintentional case: when user enters n = -2,-1
            return -1;
        if(n==0 || n==1)                    // --> base case condition
            return 1;
        return n * factorial(n-1);      //--> logic of recursion

    }

    public int fibonacci(int n){
        if(n<0)
            return -1;
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
