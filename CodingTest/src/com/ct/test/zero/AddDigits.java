package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : OX퀴즈
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

public class AddDigits {

	public static void main(String[] args) {

		int n = 930211;

		int sol = sol(n);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int n) {

		int answer = 0;

		String[] nums = String.valueOf(n).split("");

		for (int i = 0; i < nums.length; i++) {
			answer += Integer.valueOf(nums[i]);
		}

		return answer;
	}

}
