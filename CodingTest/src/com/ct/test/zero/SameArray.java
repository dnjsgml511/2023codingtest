package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 배열의 유사도
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */

public class SameArray {

	public static void main(String[] args) {

		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "com", "b", "d", "p", "c" };

		int sol = sol(s1, s2);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String[] s1, String[] s2) {
		int answer = 0;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}

		return answer;
	}

}
