class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        long count=0;
        for(int i=0;i<intervals.length-1;i++){
            int left=i;
            int right=intervals.length-1;
            int k=0;
            while(left<=right){
                int mid = (left + (right-left)/2);
                if(intervals[i][1]>=intervals[mid][0]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            count+=(left-i-1);
        }
        return count;
    }
}