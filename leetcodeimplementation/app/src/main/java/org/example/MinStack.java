package org.example;
import java.util.List;
import java.util.ArrayList;
public class MinStack {
    public List<Float> data;
    public List<Float> min;
    public MinStack(){
        data= new ArrayList<>();
        min= new ArrayList<>();
        min.add(Float.POSITIVE_INFINITY);

    }
    public void push(float x){
        data.add(x);
        if (x <= min.get(min.size()-1)){
            min.add(x);
        }

    }
    public void pop(){
        if(isEmpty()){
            return;
        }
        if (min.get(min.size()-1) == data.get(data.size()-1)){
            min.remove(min.size()-1);

        }
        data.remove(data.size()-1);
        
    }
    public Float top(){
        return data.get(data.size()-1);
        
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    public float getMin(){
        return min.get(min.size()-1);
    }
    

    
}
