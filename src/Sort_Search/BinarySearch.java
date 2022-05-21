package Sort_Search;

public class BinarySearch {
    public int binarySearch1(int [] arr, int left, int right, int target){
        if(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
               return binarySearch1(arr, mid + 1, right, target);
            }
            else if (arr[mid] > target){
                return binarySearch1(arr, left, mid -1, target);
            }
        }
        return -1;
    }
    public int binarySearch(int [] arr, int target){
        int left = 0; int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                left = mid + 1;
            }
            else if (arr[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch1(arr, 0, n - 1, x);
        int result2 = ob.binarySearch(arr, x);
        System.out.println("Phần tử được tìm thấy tại vị trí: " + result2);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }

}
