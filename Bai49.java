import java.util.ArrayList;
import java.util.Scanner;
public class Bai49 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b= a.nextInt();
        ArrayList<Integer> d= new ArrayList<Integer>();
        Float max=Float.NEGATIVE_INFINITY;
        int posi=0;
        for(int i =0;i<b;i++){
            int c= a.nextInt();
            d.add(c);

        }
        if(b==d.size()){
            for(int i=0;i<d.size();i++){
                if(max< d.get(i)){
                    max= (float) d.get(i);
                    posi=i;
                }
            }
        }
        System.out.print(String.valueOf(Math.round(max))+" "+ String.valueOf(posi));
    }
}
