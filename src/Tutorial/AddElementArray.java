package Tutorial;

import java.util.Scanner;

/*
* Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
* Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).

Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1.
* In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.
* */
public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 0 ; i< n ;i++) {
            arr[i] = sc.nextInt();
        }
        int index, giatri;
        index = sc.nextInt();
        giatri = sc.nextInt();
        for(int i = n; i>index ; i--) {
            arr[i]= arr[i-1];
        }
        arr[index] = giatri;
        n++;
        for (int x : arr)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
