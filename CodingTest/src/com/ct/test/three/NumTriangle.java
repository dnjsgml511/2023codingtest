package com.ct.test.three;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * @author lwh
 * @제목 : 정수 삼각형
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/43105
 */

public class NumTriangle {

	public static void main(String[] args) {

		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };

		int sol = sol(triangle);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[][] triangle) {
		int answer = 0;

		int[][] tmp = new int[triangle.length][triangle[triangle.length - 1].length];
		tmp[0][0] = triangle[0][0];

		for (int i = 1; i < triangle.length; i++) {
			tmp[i][0] = tmp[i - 1][0] + triangle[i][0];
			tmp[i][i] = tmp[i - 1][i - 1] + triangle[i][i];

			for (int j = 1; j <= i - 1; j++) {
				tmp[i][j] = Math.max(tmp[i - 1][j - 1], tmp[i - 1][j]) + triangle[i][j];
				answer = Math.max(answer, tmp[i][j]);
			}

			for (int j = 0; j < tmp.length; j++) {
				System.out.println(Arrays.toString(tmp[j]));
			}
			System.out.println();
		}

		return answer;
	}

}
