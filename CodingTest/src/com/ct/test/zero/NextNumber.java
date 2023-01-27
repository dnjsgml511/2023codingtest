package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 다음에 올 숫자
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */

public class NextNumber {

	public static void main(String[] args) {

		int[] common = { 2, 4, 8 };

		int sol = sol(common);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[] common) {

		int answer = 0;

		if (common[0] - common[1] == common[1] - common[2]) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}

		return answer;
	}

}
