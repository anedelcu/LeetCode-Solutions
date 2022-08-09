class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        long sum = 0;
        for(int el : arr) {
            sum += el;
        }
        
        if(sum % 3 != 0 ) {
            return false;
        }
        
        long targetSum = sum / 3;
        int numArrays = 0;
        long tempSum = 0;
        for(int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            if(tempSum == targetSum) {
                tempSum = 0;
                numArrays++;
            }
        }
        return numArrays >= 3;
        
    }
}