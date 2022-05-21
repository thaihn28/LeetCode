package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    //    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++)
//                if ((nums[i] + nums[j]) == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 11, 7, 15};
        int target = 9;
        twoSum(arr, target);
    }


    // Solution 1:
    // Tạo một Map ( put key là nums[i], value là i ), chạy for để check ta có nums[i] + nums[?] = target. Kiểm tra trong map
    // đã có key nào tương ứng target - nums[?] = nums[i] chưa? (containsKey)
    // Nếu chưa thì sẽ put key, value vào map - để check tiếp
    // Nếu rồi thì set arr[0] = i; arr[1] = map.get(b) --> get index cua b


    public static int[] twoSum(int[] nums, int target) {
        // Array to store result
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(b);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(a, i);
            }
        }
        return result;
    }


}
