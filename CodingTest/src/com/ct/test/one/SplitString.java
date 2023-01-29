package com.ct.test.one;

/**
 * 
 * @author lwh
 * @제목 : 문자열 나누기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */

public class SplitString {

	public static void main(String[] args) {

		String s = "banana";

		int sol = sol(s);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String s) {
		int answer = 0;

		int tmp = 0;
		char x = 0;

		for (int i = 0; i < s.length(); i++) {
			if (tmp == 0) {
				x = s.charAt(i);
				answer++;
				tmp++;
			} else {
				if(x == s.charAt(i)) {
					tmp++;
				}else {
					tmp--;
				}
			}
		}

		return answer;

	}

}
