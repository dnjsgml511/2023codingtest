package com.ct.test;

/**
 * 
 * @author lwh 제목 : 옹알이 (1) 링크 :
 *         https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */

public class Mumbling_1 {

	public static void main(String[] args) {

		String[] babbling = { "aya", "yee", "u", "maa", "wyeoo" };

		int sol = sol(babbling);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String[] babbling) {

		int answer = 0;
		String[] can = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < can.length; i++) {
			for (int j = 0; j < babbling.length; j++) {
				babbling[j] = babbling[j].replace(can[i], "1");
			}
		}

		for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].replaceAll("1", "").equals(""))
				answer++;
		}

		return answer;
	}

}
