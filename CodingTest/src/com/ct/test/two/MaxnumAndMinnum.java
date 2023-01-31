package com.ct.test.two;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * @author lwh
 * @제목 : 최댓값과 최솟값
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */

public class MaxnumAndMinnum {

	public static void main(String[] args) {

		String s = "-1 -2 -3 -4";

		String sol = sol(s);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(String s) {

		String[] split = s.split(" ");
		Integer[] array = Stream.of(split).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		Arrays.sort(array);

		return array[0] + " " + array[array.length - 1];
	}

}
