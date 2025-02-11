import java.util.ArrayList;
import java.util.Scanner;
public class bai60 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        String line=scan.nextLine();
        Scanner type = new Scanner(line);
        int sum=0;
        int count=0;
        while(type.hasNextInt()) {
            a.add(type.nextInt());
        }
        for(int i=0; i< a.size();i++){
            if(((int) Math.sqrt((a.get(i))))* ((int) Math.sqrt((a.get(i))))==a.get(i)){
                sum+= a.get(i);
                count++;
            }
        }
        if(count==0){
            System.out.println('-');
        }
        else{
            String formatted = String.format("%.1f", (double) sum/count);
            System.out.println(formatted);
        }
    }
}
