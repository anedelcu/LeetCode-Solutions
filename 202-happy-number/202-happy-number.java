class Solution {
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        while(n != 1) {
            int nr = n;
            int sum = 0;
            set.add(nr);
            while(nr != 0) {
                sum += (nr % 10) * (nr % 10);
                nr = nr / 10;
            }
            if(set.contains(sum)) {
                return false;
            }
            n = sum;
            
        }
        return true;
    }
}