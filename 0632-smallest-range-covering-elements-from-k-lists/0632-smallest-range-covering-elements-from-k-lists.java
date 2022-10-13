class Solution {

    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Node> minHeap = new PriorityQueue<Node>((n1, n2) -> nums.get(n1.listIndex).get(n1.elementIndex) - nums.get(n2.listIndex).get(n2.elementIndex));

        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE, currentMaxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != null) {
                minHeap.add(new Node(0, i));
                currentMaxNumber = Math.max(currentMaxNumber, nums.get(i).get(0));
            }
        }
        while (minHeap.size() == nums.size()) {
            Node node = minHeap.poll();
            if (rangeEnd - rangeStart > currentMaxNumber - nums.get(node.listIndex).get(node.elementIndex)) {
                rangeStart = nums.get(node.listIndex).get(node.elementIndex);
                rangeEnd = currentMaxNumber;
            }
            node.elementIndex++;
            if (nums.get(node.listIndex).size() > node.elementIndex) {
                minHeap.add(node); // insert the next element in the heap
                currentMaxNumber = Math.max(currentMaxNumber, nums.get(node.listIndex).get(node.elementIndex));
            }
        }
        return new int[] { rangeStart, rangeEnd };
    }
}

class Node {
    int elementIndex;
    int listIndex;

    Node(int elementIndex, int listIndex) {
        this.elementIndex = elementIndex;
        this.listIndex = listIndex;
    }
}
