package leetcode56;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] intervals = {{2,4},{4,6},{1,3}};
		
		System.out.println("Input: " + Arrays.deepToString(intervals));
		
		MergeIntervalsFunction solution = new MergeIntervalsFunction();
		
		System.out.println("Soltuion: " + Arrays.deepToString(solution.merge2(intervals)));
	}
}
