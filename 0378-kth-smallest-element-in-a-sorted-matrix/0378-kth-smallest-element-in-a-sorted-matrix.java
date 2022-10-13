class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Node> minHeap = new PriorityQueue<Node>(
        (n1, n2) -> matrix[n1.rowIndex][n1.colIndex] - matrix[n2.rowIndex][n2.colIndex]);
        
        for(int i = 0; i < matrix.length; i++) {
            minHeap.add(new Node(i, 0));
        }
        
        int numberCount = 0;
        int result = 0;
        while(!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            result = matrix[node.rowIndex][node.colIndex];
            numberCount++;
            if(numberCount == k) {
                break;
            }
            node.colIndex++;
            if(node.colIndex < matrix[node.rowIndex].length) {
                minHeap.add(node);
            }
        }
        return result;
    }
}


class Node {
  int rowIndex;
  int colIndex;

  Node(int rowIndex, int colIndex) {
    this.rowIndex = rowIndex;
    this.colIndex = colIndex;
  }
}