package chapter10._04;

public class UndirectedGraph {
    private int count; // node 수
    private int[][] vertexMatrix;

    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
        vertexMatrix[from][to] = weight; // 연결되잇다. weight 1
        vertexMatrix[to][from] = weight; //
    }

    public int[][] getMatrix(){
        return vertexMatrix;
    }

}
