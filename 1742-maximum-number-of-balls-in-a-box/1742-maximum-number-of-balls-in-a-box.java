class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxBalls = 0;
        for(int i = lowLimit; i <= highLimit; i++) {
            int sumDigits = 0;
            int n = i;
            while(n != 0) {
                sumDigits += n % 10;
                n = n / 10;
            }
            map.put(sumDigits, map.getOrDefault(sumDigits, 0) + 1);
            
            maxBalls = Math.max(maxBalls, map.get(sumDigits));
        }
        
        return maxBalls;
    }
}