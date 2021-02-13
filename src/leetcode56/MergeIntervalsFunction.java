package leetcode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsFunction {
	// o(nlogn) time since we sorted
	public int[][] merge2(int[][] intervals) {
		// Error checking
        if(intervals.length <= 1 || intervals == null){
            return intervals;
        }
        
        // Sort the whole 2D array by the 0 index
        //Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        // Another way to do it
        Arrays.sort(intervals, (arr1,arr2) -> arr1[0] - arr2[0]);
        
        System.out.println("After sorting: " + Arrays.deepToString(intervals));
        
        int[] newInterval = intervals[0];
        
        List<int[]> list = new ArrayList<>();
        
        // Add the first element as starting point to compare
        list.add(newInterval);
        
        for(int i = 0; i < intervals.length; i++){
        	// ex: [1,3] [2,4] = [1,4]
            if(intervals[i][0] <= newInterval[1]){
            	// Since we have the reference to it, we will change the value too
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                newInterval = intervals[i];
                
                list.add(newInterval);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
	
	// Great solution, actually thought of this solution
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1 || intervals == null){
            return intervals;
        }
    
        // How many got merge
        int mergeCount = 0;
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = i + 1; j < intervals.length; j++){
                int a0 = intervals[i][0];
                int a1 = intervals[i][1];
                
                int b0 = intervals[j][0];
                int b1 = intervals[j][1];
                
                // Base case, fail if they break the rule
                if(a0 > b1 || a1 < b0){
                    continue;
                }
                
                intervals[j][0] = Math.min(a0, b0);
                intervals[j][1] = Math.max(a1,b1);
                
                mergeCount++;
                
                // Change the value to mark we changed it
                intervals[i][0] = Integer.MIN_VALUE;
                
                // Whenever we changed an element, stop comparing current to next element
                break;
            }    
        }
        
        // The final answer will only have certain amount of elements
        int[][] answer = new int[intervals.length - mergeCount][2];
        
        int j = 0;
        
        for(int i = 0; i < intervals.length; i++){
        	// If its min_value, we know we changed it earlier
            if(intervals[i][0] != Integer.MIN_VALUE){
                answer[j] = intervals[i];
                j++;
            }

        }
        
        return answer;
    }
}
