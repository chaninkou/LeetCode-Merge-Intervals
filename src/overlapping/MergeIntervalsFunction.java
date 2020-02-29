package overlapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsFunction {
	public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1 || intervals == null){
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        int[] newInterval = intervals[0];
        
        List<int[]> list = new ArrayList<>();
        
        list.add(newInterval);
        
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                newInterval = intervals[i];
                
                list.add(newInterval);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
