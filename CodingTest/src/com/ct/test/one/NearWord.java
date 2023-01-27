package com.ct.test.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : 제곱수 판별하기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */

public class NearWord {

	public static void main(String[] args) {

		String s = "banana";

		List<Integer> sol = sol(s);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static List<Integer> sol(String s) {

		List<Integer> answer = new ArrayList<Integer>();

		HashMap<Character, Integer> map = new HashMap<>();

		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			Integer check = map.get(array[i]);
			if (check == null) {
				map.put(array[i], i);
				answer.add(-1);
			} else {
				answer.add(i - check);
			}
			map.put(array[i], i);
		}

		return answer;

	}

}
