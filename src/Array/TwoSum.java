package Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int []res = twoSum.twoSumSolution(num,target);
            System.out.println(Arrays.toString(res));

    }
    public int[] twoSumSolution(int[] num, int target ){
        for( int i = 0 ; i < num.length; i++){
            for ( int j = i + 1 ; j < num.length; j++){
                if ( num [j] == target - num [i] ){
                    return new int[] {i , j};
                }
            }
        }

        return null;
    }
}
