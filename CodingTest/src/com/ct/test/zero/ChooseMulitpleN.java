package com.ct.test.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : n의 배수 고르기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

public class ChooseMulitpleN {

	public static void main(String[] args) {

		int n = 3;
		int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		List<Integer> sol = sol(n, numlist);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static List<Integer> sol(int n, int[] numlist) {

		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer.add(numlist[i]);
			}
		}

		return answer;
	}

}
