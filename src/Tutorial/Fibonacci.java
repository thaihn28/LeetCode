package Tutorial;

public class Fibonacci {

    public static void main(String[] args) {
            fibonacci(10);
        }
        public static void fibonacci(int maxNumber) {
            int previousNumber = 0;
            int nextNumber = 1;
            System.out.print("Tutorial.Fibonacci Series of " + maxNumber + " numbers:");
            for (int i = 1; i <= maxNumber; ++i) {
                System.out.print(previousNumber + " ");
                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }
        }
}
