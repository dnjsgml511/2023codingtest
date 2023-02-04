package com.ct.test.zero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author lwh
 * @제목 : 가장 큰 수 찾기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */

public class FindBigNum {

	public static void main(String[] args) {

		int[] array = {1, 8, 3};

		int[] sol = sol(array);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int[] sol(int[] array) {
		int[] answer = new int[2];

		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		int max = Arrays.stream(array).max().getAsInt();
		int index = list.indexOf(max);

		answer[0] = max;
		answer[1] = index;
		
		return answer;
	}

}
