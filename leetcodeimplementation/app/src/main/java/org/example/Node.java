package leetcodeimplementation.app.src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public int data;
    public List<Node> neighbors;

    public Node(int data){
        this.neighbors= new ArrayList<>();
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data= data;
    }

    public void addNeighbor(Node neighbor){
        neighbors.add(neighbor);
    }

    public List<Node> getNeighbors(){
        return neighbors;
    }

    public boolean hasNeighbors(Node neighbor){
        return neighbors.contains(neighbor);
    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        
        sb.append(", Data: ").append(String.valueOf(data));
        
        sb.append(", Neighbors: [");
        for (Node neighbor : neighbors) {
            sb.append(neighbor.data).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
