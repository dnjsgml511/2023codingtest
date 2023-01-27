package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 문자열 밀기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */

public class ShiftString {

	public static void main(String[] args) {

		String A = "abc";
		String B = "abc";

		int sol = sol(A, B);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String A, String B) {
		return (B + B).indexOf(A);
	}

}
