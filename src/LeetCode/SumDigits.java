package LeetCode;

public class sumDigits {
    static int test;
        public static void main(String[] args) {
            int numX = 20;
            int numY = 5;
            System.out.println(SumDigits(numX, numY));

        }
        public static int  SumDigits(int numX, int numY)
        {
            int  answer = 0;

            // Write your code here
            for (int i = 1; i <= numX; i++) {
                int s = 0;
                int x = i;
                while( x>0 ) {
                    s+= x%10;
                    x /= 10;
                }
                if(s == numY){
                    System.out.println(s);
                    answer++;
                }
            }
            return answer;
        }
}
