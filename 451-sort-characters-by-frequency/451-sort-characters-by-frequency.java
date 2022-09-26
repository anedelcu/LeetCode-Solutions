class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(map.entrySet());
        int index = 0;
        while(!maxHeap.isEmpty()) {
            int freq = maxHeap.peek().getValue();
            char c = maxHeap.poll().getKey();
            int j = 0;
            while(j < freq) {
                ch[index] = c;
                j++;
                index++;
            }
        }
        return new String(ch);
    }
}