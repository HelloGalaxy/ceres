package cn.helper;

import edu.princeton.cs.algs4.StdRandom;

public class RandomArray {

	public static int[][] GetRandomArray(int m, int n) {
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = StdRandom.uniform(10);
			}
		}
		return array;
	}

	public static int[] GetRandomArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = StdRandom.uniform(10);
		}
		return array;
	}
}
