package Sort_Search;

/*
* 1: Lặp lại từ arr [1] đến arr [n] trên mảng.
2: So sánh phần tử hiện tại với phần tử trước của nó.
3: Nếu phần tử chính nhỏ hơn phần tử trước của nó, hãy so sánh nó với các phần tử trước đó.
* Di chuyển các phần tử lớn hơn lên một vị trí để tạo khoảng trống cho phần tử được hoán đổi.
* */
public class InsertionSort {
    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {
            // chon mot gia tri de chen
            valueToInsert = arr[i];
            // lua chon vi tri de chen
            holePosition = i;
            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyen phan tu: " + arr[holePosition] + " tai " + holePosition);
            }
            if (holePosition != i) {
                System.out.println(" Chen phan tu: " + valueToInsert
                        + ", tai vi tri: " + holePosition);
                // chen phan tu tai vi tri chen
                arr[holePosition] = valueToInsert;
            }
            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 9, 7, 0, 2, 8, 1 };

        InsertionSort sapXepChen = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChen.display(arr);
    }
}
