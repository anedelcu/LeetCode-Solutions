class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int [][] result = new int[k][2];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (p1, p2) -> (p2[0]*p2[0] + p2[1]*p2[1]) - (p1[0]*p1[0] + p1[1]*p1[1]) );
        for(int i = 0; i < k; i++) {
            maxHeap.add(points[i]);
        }
        
        for(int i = k; i < points.length; i++) {
            if(points[i][0]  * points[i][0] + points[i][1]  * points[i][1] < maxHeap.peek()[0] * maxHeap.peek()[0] + maxHeap.peek()[1] * maxHeap.peek()[1]) {
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
        System.out.println(maxHeap.peek()[0]);
        System.out.println(maxHeap.peek()[1]);
        System.out.println(maxHeap.size());
        System.out.println(points.length);
        for(int i = 0; i < result.length; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }                                                        
                                                                 
                                                                 
}