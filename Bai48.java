import java.util.ArrayList;
import java.util.Scanner;
public class Bai48 {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int n =a.nextInt();
        ArrayList<Integer> b= new ArrayList<Integer>();
        ArrayList<Integer> d= new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            int c=a.nextInt();
            b.add(c);

        }
        if(n== b.size()){
            for(int i=0;i<b.size();i++){
                if(b.get(i) %5==0){
                    d.add(b.get(i));
                    count+=b.get(i);

                }
            }
        }
        if(d.size()==0){
            System.out.println("-");
            System.out.println(0);
        }
        else{
            for(int i=0; i < d.size();i++){
                System.out.print(String.valueOf(d.get(i))+" ");
            }
            System.out.println("");
            System.out.println(count);

        }





    }
}
