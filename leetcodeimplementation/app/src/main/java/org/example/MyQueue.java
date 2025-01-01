package leetcodeimplementation.app.src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MyQueue<T> {
    public List<T> data;
    public int start;

    public MyQueue(){
        data= new ArrayList<T>();
        start =0;

    } 

    public void push(T x){
        data.add(x);
    }

    public Object pop(){
        
        
        if(isEmpty()==false){
            start++;
            return data.get(start -1);
        }
        else{
            return -10000000;
        }
    }

    public T Front(){
        return data.get(start);

    }

    public boolean isEmpty(){
        return start >= data.size();

    }
    public int getSize(){
        return data.size()- start;
    }

    
}
