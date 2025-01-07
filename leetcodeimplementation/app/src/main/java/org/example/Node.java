package leetcodeimplementation.app.src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;

public class Node {
    public int x;
    public int y;
    public List<Node> neighbors;

    public Node(int x, int y){
        this.neighbors= new ArrayList<>();
        this.x = x;
        this.y=y;

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x= x;
    }
    public void setY(int y){
        this.y =y;
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
        
        sb.append(", Data: ").append(String.valueOf(x)).append(String.valueOf(y));

        
        sb.append(", Neighbors: [");
        for (Node neighbor : neighbors) {
            sb.append(neighbor.x).append(" ");
            sb.append(neighbor.y).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
