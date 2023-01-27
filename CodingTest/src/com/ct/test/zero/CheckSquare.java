package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 제곱수 판별하기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */

public class CheckSquare {

	public static void main(String[] args) {

		int n = 145;

		int sol = sol(n);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int n) {

		int checkNum = 0;

		while (checkNum * checkNum < n) {
			checkNum++;
			if (checkNum * checkNum == n) {
				return 1;
			}

		}

		return 2;
	}

}
