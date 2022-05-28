package Tutorial;

public class Fibonacci {

    public static void main(String[] args) {
        int test = 15;
        for(int i = 0; i < test; i++){
           /* System.out.print(fibonacciWithoutRecursion(i) + " ");*/
            System.out.println(fibonacciWithoutRecursion(i));
        }
    }

    public static int fibonacciWithoutRecursion(int n){
        int firstNum = 0;
        int secondNum = 1;
        int sum = 1;
        if(n < 0){
            return -1;
        }else if(n == 0 || n == 1){
            return n;
        }else {
            for(int i = 2; i < n; i++){
                firstNum = secondNum;
                secondNum = sum;
                sum = firstNum + secondNum;
            }
        }
        return sum;
    }

    public static int fibonacciWithRecursion(int n){
        if(n < 0){
            return -1;
        } else if (n == 0 || n == 1) {
           /* int g = n;*/
            return n;
        }else {
           /* int x = fibonacciWithRecursion(n-1) + fibonacciWithRecursion(n-2);*/
            return fibonacciWithRecursion(n-1) + fibonacciWithRecursion(n-2);
        }
    }

}


