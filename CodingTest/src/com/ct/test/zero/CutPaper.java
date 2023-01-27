package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 종이 자르기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120922
 */

public class CutPaper {

	public static void main(String[] args) {

		int n = 2;
		int m = 5;

		int sol = sol(n, m);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int M, int N) {
		return M * N - 1;
	}

}
