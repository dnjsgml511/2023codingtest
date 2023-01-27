package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 문자열안에 문자열
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */

public class StringInString {

	public static void main(String[] args) {

		String str1 = "AbcAbcA";
		String str2 = "AAA";

		int sol = sol2(str1, str2);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String str1, String str2) {
		return str1.indexOf(str2) == -1 ? 2 : 1;
	}

	public static int sol2(String str1, String str2) {
		return str1.contains(str2) ? 1 : 2;
	}

}
