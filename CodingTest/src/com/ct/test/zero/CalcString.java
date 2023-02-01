package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 문자열 계산하기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */

public class CalcString {

	public static void main(String[] args) {

		String my_string = "3 + 4 - 5";

		int sol = sol(my_string);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String my_string) {
		int answer = 0;

		String[] split = my_string.split(" ");
		answer = Integer.valueOf(split[0]);

		for (int i = 1; i < split.length; i = i + 2) {
			if (split[i].equals("+")) {
				answer += Integer.valueOf(split[i+1]);
			}else {
				answer -= Integer.valueOf(split[i+1]);
			}
		}

		return answer;
	}

}
