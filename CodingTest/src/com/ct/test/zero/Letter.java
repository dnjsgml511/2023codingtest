package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 편지
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */

public class Letter {

	public static void main(String[] args) {

		String message = "happy birthday!";

		int sol = sol(message);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String message) {
		return message.length() * 2;
	}

}
