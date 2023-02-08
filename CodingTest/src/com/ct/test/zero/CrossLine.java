package com.ct.test.zero;

import java.util.HashSet;

/**
 * 
 * @author lwh
 * @제목 : 겹치는 선분의 길이
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */

public class CrossLine {

	public static void main(String[] args) {

//		int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		int[][] lines = { { 0, 2 }, { -3, -1 }, { -2, 1 } };

		int sol = sol(lines);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[][] lines) {
		int answer = 0;

		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> overSet = new HashSet<Integer>();
		int max = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]; j <= lines[i][1]; j++) {
				if (!set.add(j)) {
					overSet.add(j);

					min = Math.min(min, j);
					max = Math.max(max, j);
				}
			}
		}

		System.out.println(overSet);
		System.out.println(min + " / " + max);

		int index = 0;
		for (int i = min; i <= max; i++) {
			System.out.println(overSet);
			
			boolean check = overSet.remove((Object)i);
			System.out.println(i + " / " + check);
			
			
			System.out.println(overSet);
			System.out.println("--------");
			System.out.println();
		}

		return answer;
	}

}
