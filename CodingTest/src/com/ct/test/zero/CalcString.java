package com.ct.test.zero;

import java.util.Arrays;

/**
 * 
 * @author lwh
 * @제목 : n의 배수 고르기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

public class CalcString {

	public static void main(String[] args) {

		String my_string = "3 + 4 - 5";

		int sol = sol(my_string);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String my_string) {
		System.out.println(my_string);
		int answer = 0;

		String[] split = my_string.split(" ");

		for (int i = 0; i < split.length - 1; i = i + 2) {
			if (split[i + 1].equals("+")) {
				answer += Integer.valueOf(split[i]);
			} else {
				answer -= Integer.valueOf(split[i]);
			}
		}

		System.out.println(split[split.length - 1]);
		if (split[split.length - 2].equals("+")) {
			answer += Integer.valueOf(split[split.length - 1]);
		} else {
			answer -= Integer.valueOf(split[split.length - 1]);
		}

		return answer;
	}

}
