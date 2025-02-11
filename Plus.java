import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class Plus {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a = new ArrayList<>();
        int i=digits.length-1;
        boolean def= false;
        while(i>=0){
            if (digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                def=true;
                digits[i]=0;
            }
            i-=1;

        }
        a.add(1);
        for( i =0; i<=digits.length-1;i++){
            a.add(digits[i]);
        }
        int[] nums = a.stream().mapToInt(j -> j).toArray();
        return nums;

        
    

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

        Plus function = new Plus();
        int[] result = function.plusOne(nums);
        System.out.println(Arrays.toString(result));

        scan.close();
    }
}
