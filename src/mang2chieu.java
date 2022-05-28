import java.util.Scanner;

public class mang2chieu {
    public static void main(String agrs[]) {

//        int [][] arr = new int[3][3];
//        int diem[][] = {{1, 2}, {3, 4}};
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[][] = new int[n][m];
//        int [] arr = new int[n];
        int [] arr = {5, 6, 4,7, 3, 1, 7, 7};
        int sum = 0;

//        System.out.println(diem.length);
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < diem.length; j++) {
//                System.out.print(diem[i][j] + "\t");
//                sum = sum + diem[i][j];
//            }
            if(arr[i] > arr[k]){
                k = i;
            }
//            System.out.print("\n");
        }
        System.out.print("K " + k);
//        System.out.print(sum);
    }
}