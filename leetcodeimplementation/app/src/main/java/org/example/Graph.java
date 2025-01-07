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
    public int numIslands(char[][] grid){
        HashSet<Node> visited= new HashSet<Node>();
        int output=0;
        for(int x=0;x<grid.length;x++){
            for(int y=0;y<grid[0].length;y++){
                if(grid[x][y]==1 && visited.contains(grid[x][y])){
                    MyQueue<Node> queue= new MyQueue<Node>();
                    Node cur = new Node(x,y);
                    queue.push(cur);
                    while(queue.isEmpty() ==false){
                        Node curN= (Node) queue.pop();
                        visited.add(cur);
                        if(grid[curN.x - 1][curN.y]==1 && !visited.contains(grid[curN.x-1][curN.y])){
                            Node sideN = new Node(curN.x-1, curN.y);
                            queue.push(sideN);
                        }
                        else if(grid[curN.x][curN.y+1]==1 && !visited.contains(grid[curN.x][curN.y+1])){
                            Node sideN = new Node(curN.x, curN.y+1);
                            queue.push(sideN);
                        }
                        else if(grid[curN.x+1][curN.y]==1 && !visited.contains(grid[curN.x+1][curN.y])){
                            Node sideN = new Node(curN.x+1, curN.y);
                            queue.push(sideN);
                        }
                        else if(grid[curN.x][curN.y-1]==1 && !visited.contains(grid[curN.x][curN.y-1])){
                            Node sideN = new Node(curN.x, curN.y-1);
                            queue.push(sideN);
                        }
                    }
                    output++;
                }
            }
        }
        return output;
    }
}




    

