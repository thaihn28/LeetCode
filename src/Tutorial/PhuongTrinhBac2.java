package Tutorial;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số bậc 1, b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hằng số tự do, c = ");
        double c = scanner.nextDouble();
        phuongTrìnhBac2(a, b, c);
    }

    private static void phuongTrìnhBac2(double a, double b, double c){
        int result = 0;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        double x1, x2;
        double del = Math.pow(b, 2) - 4*a*c;
        if(del > 0){
            x1 = (-b + Math.sqrt(del)) / (2*a);
            x2 = (-b - Math.sqrt(del)) / (2*a);
            System.out.println("x1: " + x1 + "- x2: " + x2);
        } else if (del == 0) {
            x1 = -b / (2*a);
            System.out.println("x1 = x2 " + x1);
        }else {
            System.out.println("Vo nghiem");
        }


    }

}

