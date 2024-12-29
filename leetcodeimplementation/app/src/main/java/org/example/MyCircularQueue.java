package leetcodeimplementation.app.src.main.java.org.example;
public class MyCircularQueue {
    public int[] a;
    public int head;
    public int tail;
    public int size;
    public MyCircularQueue(int k){
        a= new int[k];
        head =-1;
        tail=-1;
        size=k;





    }
    public void enQueue(int x){
        if(isFull()==true ){
            return;
        }
        if(isEmpty()==true){
            head=0;
        
        }
        tail= (tail+1)%size;
        a[tail]=x;

        }
    public int deQueue(){
        if (isEmpty()==true){
            return -1;
        }
        if(head==tail){
            head=-1;
            tail=-1;
            
        }
        head=(head+1)%size;
        return a[head];

    }
    public int front(){
        if(isEmpty()==true){
            return -1;
        }
        return a[head];
    }
    public int rear(){
        if(isEmpty()==true){
            return -1;
        }
        return a[tail];
    }
    public boolean isEmpty(){
        if (head==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(head==(tail+1)%size){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        
    }


}


