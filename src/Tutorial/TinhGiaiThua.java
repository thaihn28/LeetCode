package Tutorial;

public class TinhGiaiThua {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Giai thua cua " + num + " la " + noRecursion(num));
        System.out.println("Giai thua cua " + num + " la " + recursion(num));
       
    }
    public static int noRecursion(int n){
        int factorial = 1;
        /*if(n == 0 || n == 1){
            return factorial;
        }else{
            for(int i = 2; i <= n; i++){
                factorial *= i;
            }
        }*/
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static int recursion(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * recursion(n-1);
        }
    }


}
