class Graph:
    def __init__(self):
        self.adjacency_list = {}

    def add_vertex(self, vertex):
        if vertex not in self.adjacency_list:
            self.adjacency_list[vertex] = [] # neighbor

    def add_edge(self, vertex1, vertex2):
        if vertex1 in self.adjacency_list and vertex2 in self.adjacency_list:
            self.adjacency_list[vertex1].append(vertex2)
            self.adjacency_list[vertex2].append(vertex1)   


def main():
    m = int(input())
    n = int(input())
    grid=[]
    m, n = map(int, input().split())
    grid = [list(map(int, input().split())) for _ in range(m)]
    
    # 1 0 0
    # 1 1 1
    # 0 0 0
    graph = Graph()
    for i in range(m):
        for j in range(n):
            graph.add_vertex((i, j, grid[i][j]))

    for i in range(m):
        for j in range(n):
            if j - 1 < 0: # check left
                continue
            else:
                graph.add_edge((i, j, grid[i][j]), (i, j-1, grid[i][j-1]))

            if j + 1 >= n: # check right
                continue
            else:
                graph.add_edge((i, j, grid[i][j]), (i, j+1, grid[i][j+1]))

            if i - 1 < 0: # check up
                continue
            else:
                graph.add_edge((i, j, grid[i][j]), (i-1, j, grid[i-1][j]))

            if i + 1 >= m: # check down
                continue
            else:
                graph.add_edge((i, j, grid[i][j]), (i+1, j, grid[i+1][j]))
    
    output = 0
    visited = []
    # visited: [ (1, 0), (0, 1) ]

    # 1 0 0
    # 1 1 1
    # 0 0 0
    for i in range(m):
        for j in range(n):
            if grid[i][j]==1:
                visited.append(grid[i][j])
                while len(visited)!=0:
                    current_node = visited[-1] # (0, 0, 1)
                    visited.pop()
                    grid[current_node[0], current_node[1]] = 0
                    graph.adjacency_list[current_node] = graph.adjacency_list[(current_node[0], current_node[1], 0)]

                    for neighbor in graph.adjacency_list[current_node]:
                        if neighbor[2] == 1:
                            visited.append(neighbor)

                    del graph.adjacency_list[current_node]
            output+=1
    print(output)      
                    

if __name__ == "__main__":
    main()