package Sort_Search;


//1. Thiết lập giá trị nhỏ nhất (min) về vị trí số 0.
//2. Tạo vòng lặp for để di chuyển ranh giới của sorted list và unsorted list.
//3. Tìm phần tử nhỏ nhất trong list chưa được sắp xếp.
//4. Sau khi tìm được phần tử nhỏ nhất thì đổi chỗ phần tử đó với phần tử đầu tiên.
//Ở bước này chúng ta cần viết một hàm Swap(), hàm này mình sẽ viết ở bên dưới.
//5.Lặp lại cho tới khi list được sắp xếp xong.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 9};
        System.out.println("Mang du lieu dau vao: ");
        display(arr);
        System.out.println("---------------");
        selectionSort(arr);
        System.out.println("---------------");
        display(arr);
    }
    public static void selectionSort(int [] arr) {
        int indexMin, i, j;
        // lap qua ta ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;
            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                System.out.println(" ==> Trao doi phan tu: [" + arr[i]
                        + ", " + arr[indexMin] + "]");
                // Trao doi cac so
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }
    public static void display(int arr[]) {
        int i;
        System.out.print("[");
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
}
