import java.util.ArrayList;
import java.util.Scanner;
public class Bai47 {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int n= a.nextInt();
        ArrayList<Integer> b= new ArrayList<Integer>();
        ArrayList<Integer> c= new ArrayList<Integer>();
        ArrayList<Integer> d= new ArrayList<Integer>();
        int countA=0;
        int countB=0;
        for(int i=0;i<n;i++){
            int e=a.nextInt();
            b.add(e);
        }
        if(n== b.size()){
            for(int i=0;i<b.size();i++){
                if(b.get(i) >0){
                    c.add(b.get(i));
                    countA+=1;

                    

                }
                else if(b.get(i)<0){
                    d.add(b.get(i));
                    countB+=1;
                }
            }
        }
        System.out.println(String.valueOf(countA)+" "+String.valueOf(countB));
        if(c.size()==0){
            System.out.println("-");
            for(int i=0; i < d.size();i++){
                System.out.print(String.valueOf(d.get(i))+" ");
            }
            System.out.println("");
        }
        else if(d.size()==0){
            for(int i=0; i < c.size();i++){
                System.out.print(String.valueOf(c.get(i))+" ");
            }
            System.out.println("");
            System.out.println("-");

        }
        else{
            for(int i=0; i < c.size();i++){
                System.out.print(String.valueOf(c.get(i))+" ");
            }
            System.out.println("");
            for(int i=0; i < d.size();i++){
                System.out.print(String.valueOf(d.get(i))+" ");
            }
            System.out.println("");

        }
        
        



    
    }
}
