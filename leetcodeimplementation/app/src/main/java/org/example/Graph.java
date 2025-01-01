package leetcodeimplementation.app.src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;
import leetcodeimplementation.app.src.main.java.org.example.Node;
import leetcodeimplementation.app.src.main.java.org.example.MyQueue;
import java.util.HashSet;
public class Graph {
    public List<Node>  nl;
    public Graph(){
        nl= new ArrayList<Node>();
    }
    public int BFS(Node root, Node target){
        MyQueue<Node> queue= new MyQueue<Node>();
        HashSet<Node> visited= new HashSet<Node>();
        int step=0;
        queue.push(root);
        visited.add(root);
        while (queue.getSize() !=0  ){
            int size = queue.getSize();
            for(int i =0; i<size; i++){
                Node cur= queue.Front();
                if (cur== target){
                    return step;
                }
                for(Node next: cur.neighbors){
                    if(visited.contains(next)== false){
                        queue.push(next);
                        visited.add(next);
                    }
                }
                queue.pop();


            }
            step++;
        }
        return -1;

    }




    
}
