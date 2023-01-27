package com.ct.test.zero;

import java.util.Arrays;

/**
 * 
 * @author lwh
 * @제목 : 문자열 정렬하기 (2)
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */

public class SortString2 {

	public static void main(String[] args) {

		String my_string = "Bcad";

		String sol = sol2(my_string);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(String my_string) {

		String[] tmp = my_string.toLowerCase().split("");

		Arrays.sort(tmp);

		return String.join("", tmp);
	}
	
	public static String sol2(String my_string) {

		char[] tmp = my_string.toLowerCase().toCharArray();

		return new String(tmp);
	}

}
