import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        


        if(a==1){
            System.out.println(12000);
        }
        else if(a>=2 && a <=30){
            int b = 12000+ (a-1)*10000;
            System.out.println(b);
        }
        else if(a>=31){
            int b = 12000+ 29*10000 +(a-30)*9000;
            System.out.println(b);
        }
        scanner.close();
    }
}
        
       