package Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
    int[] number = { 2 , 7, 11, 15}  ;
    int target = 9;
    var add = new TwoSum();
    int[] result = add.twoSum(number , target);
    System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] number, int target) {
        int n = number.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[j] == target - number[i]) {
                    return new int[] {i , j} ;
                }
            }
        }
        return null;
    }
}