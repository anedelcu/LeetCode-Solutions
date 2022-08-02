class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i = 0;i < numRows; i++){
            int num = 1;
            List<Integer> res2 = new ArrayList<>();
            for(int j = 0;j <= i; j++){
                res2.add(num);
                num = num * (i - j) / ( j + 1);
            }
            res.add(res2);
        }
        return res;
    }
}