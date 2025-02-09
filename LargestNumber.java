import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int index = -1;
        int max =-1;
        int secondMax=-1;
        for(int i=0;i<n;i++){
            if(nums[i] > max ){
                index=i;
                secondMax=max;
                max=nums[i];

            }
            else if (nums[i]> secondMax){
                secondMax=nums[i];
            }
        }
        
        if(max >= 2*secondMax){
            return index;
        }
        else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        int[] nums = a.stream().mapToInt(i -> i).toArray();

        LargestNumber function = new LargestNumber();
        int result = function.dominantIndex(nums);
        System.out.println(result);

        scan.close();
    }
}

