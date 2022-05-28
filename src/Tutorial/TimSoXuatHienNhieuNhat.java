package Tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimSoXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        for(int k : map.keySet()){
            System.out.print(k + " - " + map.get(k) + ";");
        }
    }
    public static void sortArr(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
