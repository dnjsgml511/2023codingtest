package com.ct.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author lwh
 * @제목 : 과일 장수
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */

public class FruitSaller {

	public static void main(String[] args) {

		int k = 4;
		int m = 3;
		int[] score = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };

		int sol = sol(k, m, score);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int k, int m, int[] score) {
		int answer = 0;

		Arrays.sort(score);
		List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());

		while (list.size() % m != 0) {
			list.remove(0);
		}

		for (int i = 0; i < list.size() / m; i++) {
			List<Integer> tmp = list.subList(i * m, i * m + m);
			answer += tmp.get(0) * m;
		}

		return answer;
	}
}
