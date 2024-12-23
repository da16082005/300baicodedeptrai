import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int TBHKI = scanner.nextInt();
        int TBHKII = scanner.nextInt();
        float TBCN = (float)(TBHKI+(TBHKII*2))/3;
        
        System.out.printf("%.1f%n", TBCN);


        if(TBCN>8){
            System.out.println("Gioi");
        }
        else if(TBCN>=6.5 && TBCN <8){
            System.out.println("Kha");
        }
        else if(TBCN>=5 && TBCN <6.5){
            System.out.println("Trung binh");
        }
        else if(TBCN>=3.5 && TBCN<5){
            System.out.println("Yeu");
        }
        else if(TBCN < 3.5){
            System.out.println("Kem");
        }
        scanner.close();
    }
}
        
       