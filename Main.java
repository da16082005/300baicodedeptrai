import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List<Integer> so = new ArrayList<>();
        for(int i=1; i<=a;i++){
            if(i%2==0){
                so.add(i);
            }
        }
        int sum=0;
        for(int tong: so){
            sum+=tong;
        }
        System.out.println(sum);

        
        
    }
}



    


       