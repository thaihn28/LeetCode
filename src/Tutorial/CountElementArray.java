package Tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElementArray {
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
       int max = 0;
        for(int k : map.keySet()){
            int value = map.get(k);
            System.out.print(k + " - " + map.get(k) + "; ");
            if(value > max){
                max = value;
            }
        }
        System.out.println("Max lan 1:" + max);
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(max == m.getValue()) {
                System.out.println("So xuat hien nhieu nhat " + m.getKey());
            }
            /*System.out.println(m.getValue());*/
        }

    }
}
