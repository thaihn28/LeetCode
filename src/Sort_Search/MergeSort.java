package Sort_Search;

public class MergeSort {
    // Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l..m]
    // Mảng con thứ hai là arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int lengthOfLeft = m - l + 1;
        int lengthOfRight = r - m;
        // Tạo mảng tạm
        int L[] = new int[lengthOfLeft];
        int R[] = new int[lengthOfRight];
        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < lengthOfLeft; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < lengthOfRight; ++j)
            R[j] = arr[m + 1 + j];
        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;
        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < lengthOfLeft && j < lengthOfRight) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < lengthOfLeft) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < lengthOfRight) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Tìm điểm chính giữa
            int m = (l + r) / 2;
            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 5, 6, 8 };

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
