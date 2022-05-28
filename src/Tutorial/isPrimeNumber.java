package Tutorial;

import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            if(isPrime(i)) {
                System.out.print("La-" + i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        // So nguyen to la so lon hon mot, va co hai uoc la 1 va chinh no
        if (n < 2){
            return false;
        }
        // Vi du n = 20; check neu 20 chia het cho i thi khong la so nguyen to
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
