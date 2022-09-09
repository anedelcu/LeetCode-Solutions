class Solution 
{
    public int numberOfWeakCharacters(int[][] properties) 
    {
        int count=0,max=Integer.MIN_VALUE;
        Arrays.sort(properties,(a,b)->(a[0]==b[0])?(a[1]-b[1]):(b[0]-a[0]));
        for(int i=0;i<properties.length;i++)
        {
            if(properties[i][1]<max)
                count++;
            max=Math.max(properties[i][1],max);
        }
        return count;
    }
}