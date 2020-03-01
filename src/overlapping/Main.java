package overlapping;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,4},{4,6}};
		
		System.out.println("Input: " + Arrays.deepToString(intervals));
		
		MergeIntervalsFunction solution = new MergeIntervalsFunction();
		
		System.out.println("Soltuion: " + Arrays.deepToString(solution.merge(intervals)));
	}
}
