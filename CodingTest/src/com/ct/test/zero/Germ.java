package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 옹알이
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */

public class Germ {

	public static void main(String[] args) {

		int n = 7;
		int t = 15;

		int sol = sol(n, t);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int n, int t) {
		return (int) Math.pow(2, t) * n;
	}

}
