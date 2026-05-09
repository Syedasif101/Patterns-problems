import java.util.ArrayList;
import java.util.Collections;

public class DirectedGraphAgain {

    public static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        // Initialize the matrix
        for(int i=0; i<V; i++){
//            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V,0));

            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<V; j++){
                row.add(0);

            }
            mat.add(row);
        }

        // Add each edge to the adjacency matrix
        for(int[] it: edges){
            int u = it[0];
            int v = it[1];

            mat.get(u).set(v,1);
        }

        return mat;
    }
    public static void main(String[] args){
        int V = 3;
        int[][] edges = {{1,0},{1,2},{2,0}};

        ArrayList<ArrayList<Integer>> mat = createGraph(V, edges);

        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
