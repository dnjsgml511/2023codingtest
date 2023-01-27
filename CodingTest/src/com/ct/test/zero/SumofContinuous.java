package com.ct.test.zero;

import java.util.Arrays;

/**
 * 
 * @author lwh
 * @제목 : 연속된 수의 합
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

public class SumofContinuous {

	public static void main(String[] args) {

		int num = 4;
		int total = 14;

		int[] sol = sol(num, total);

		System.out.println(" -- Sol --");
		System.out.println(Arrays.toString(sol));
	}

	public static int[] sol(int num, int total) {
		int[] answer = new int[num];

		int middle = total / num;

		answer[(num - 1) / 2] = middle;

		for (int i = 1; i < (num - 1) / 2 + 1; i++) {
			answer[(num - 1) / 2 + i] = middle + i;
			answer[(num - 1) / 2 - i] = middle - i;
		}

		if (answer[answer.length - 1] == 0) {
			answer[answer.length - 1] = middle + (num) / 2;
		}

		return answer;
	}

}
