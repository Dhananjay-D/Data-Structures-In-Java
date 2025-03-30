package Interview_ONCAMPUS;
// PriorityQueue - MIN HEAP example
// time complexity: O(n*log(n))
import java.util.PriorityQueue;

public class ConnectNRopes{
    public static int minCostToConnectRopes(int[] ropes) {
        // Min-Heap (PriorityQueue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all rope lengths to the min-heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // While more than one rope remains
        while (minHeap.size() > 1) {
            // Take out two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Cost to connect them
            int cost = first + second;
            totalCost += cost;

            // Push the new rope into the heap
            minHeap.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes: " + minCostToConnectRopes(ropes));
    }
}

