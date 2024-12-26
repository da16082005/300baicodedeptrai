import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MyQueue {
    public List<Integer> data;
    public int start;
    public MyQueue(){
        data= new ArrayList<Integer>();
        start =0;

    } 
    public void push(int x){
        data.add(x);
    }
    public int pop(){
        
        
        if(isEmpty()==false){
            start++;
            return data.get(start -1);
        }
        else{
            return -100000000;
        }



    }
    public int Front(){
        return data.get(start);

    }
    public boolean isEmpty(){
        return start >= data.size();

    }

    
}
