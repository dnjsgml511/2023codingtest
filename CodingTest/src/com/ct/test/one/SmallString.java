package com.ct.test.one;

import java.math.BigInteger;

/**
 * 
 * @author lwh
 * @제목 : 크기가 작은 부분 문자열
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

public class SmallString {

	public static void main(String[] args) {

		String t = "500220839878";
		String p = "7";

		int sol = sol(t, p);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String t, String p) {
		int answer = 0;

		for (int i = 0; i <= t.length() - p.length(); i++) {
			String cut = t.substring(i, i + p.length());

			BigInteger first = BigInteger.valueOf(Long.parseLong(p));
			BigInteger second = BigInteger.valueOf(Long.parseLong(cut));

			if (first.subtract(second).longValue() >= 0)
				answer++;
		}

		return answer;

	}

}
