import java.util.ArrayList;
import java.util.Scanner;

public class Pivot {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0;i<nums.length;i++) {
            leftSum = 0;
            rightSum = 0;
            for(int j=i-1;j>=0;j--) {
                leftSum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++) {
                rightSum+=nums[j];
            }

            if(rightSum==leftSum) {
                return i;
            }
        }
        if(rightSum != leftSum) {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }

        // Convert ArrayList to int[]
        int[] nums = a.stream().mapToInt(i -> i).toArray();

        Pivot pivot = new Pivot();
        int result = pivot.pivotIndex(nums);
        System.out.println(result);

        scan.close();
    }
}
