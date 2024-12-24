import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List<Integer> so = new ArrayList<>();
        for(int i=1; i<=a;i++){
            if(i%3==0){
                so.add(i);
            }
        }
        System.out.println(so.size());

        
        if (so.size()==0){
            System.out.println("-");
        }
        else{
            for(int hi: so){
                System.out.print(String.valueOf(hi)+ ' ');
            }
        }
    }
}



    


       