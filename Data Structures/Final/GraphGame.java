import java.util.Scanner;

public class GraphGame {
    private static int numNodes, numEdges;
    private static GameMap map;
    private static GameMap visited;
    private static Queue Q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new GameMap();
        
        numNodes = sc.nextInt();
        numEdges = sc.nextInt();
        System.out.println(numNodes + " " + numEdges);
       
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            //System.out.println("Inserting " + x + " " + y);
            map.insert(x, y);
        }
        sc.close();
        
        Q = new Queue();
        visited = new GameMap();
        System.out.println(findLongest());
    }

    public static int findLongest() {
        int longest = 0;
        QNode node = new QNode(0, 1);
        Q.enqueue(node);
        
        while (!Q.isEmpty()) {
            QNode curr = Q.dequeue();
            System.out.print("Current Node: " + curr.getState());  
            System.out.println(" Current Dist: " + curr.getDist());  
            
            for (int i = curr.getState() + 1; i < numEdges; i++) {
                //if (map.find(curr.getState()) != null) {
                if (visited.find(curr.getState(), i) != null)
                    continue;
                
                //if (map.find(i) != null) {
                if (map.find(curr.getState(), i) != null) {
                    if (curr.getDist() > longest)
                        longest = curr.getDist();
                    visited.insert(curr.getState(), i);
                    QNode toQ = new QNode(curr.getDist() + 1, i); 
                    Q.enqueue(toQ);
                }
            }
        }

        return longest;
    }
}
