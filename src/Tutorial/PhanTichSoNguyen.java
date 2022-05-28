package Tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhanTichSoNguyen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n = scanner.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        System.out.printf("Ket qua %d : ", n);
        for(int i = 0; i < listNumbers.size() - 1; i++){
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(listNumbers.size() - 1));
    }

    public static List<Integer> phanTichSoNguyen(int n){
        List<Integer> numbers = new ArrayList<>();
        int i = 2;
        while (n > 1){
            if(n % i == 0){
                n = n / i;
                numbers.add(i);
            }else {
                i++;
            }
        }
        return numbers;
    }
}
