class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] res = new int[k];
        
        for(int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    soldiers++;
                }
                else {
                    break;
                }
            }
            heap.offer(new int[]{soldiers, i});
        }
        
        while(heap.size() > k) {
            heap.poll();
        }
        
        while(k > 0) {
            k--;
            res[k] = heap.poll()[1];
        }
        return res;
    }
}