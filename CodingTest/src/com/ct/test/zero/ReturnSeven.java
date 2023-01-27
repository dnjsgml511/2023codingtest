package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 7의 개수
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 */

public class ReturnSeven {

	public static void main(String[] args) {

		int[] array = { 7, 77, 17 };

		int sol = sol(array);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[] array) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			String tmp = String.valueOf(array[i]);
			String replace = tmp.replaceAll("7", "");

			answer += (tmp.length() - replace.length());
		}

		return answer;
	}

}
