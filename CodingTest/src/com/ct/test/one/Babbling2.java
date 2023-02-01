package com.ct.test.one;

/**
 * 
 * @author lwh
 * @제목 : 옹알이 (2)
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */

public class Babbling2 {

	public static void main(String[] args) {

		String[] babbling = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		int sol = sol(babbling);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(String[] babbling) {
		int answer = 0;

		String[] can = { "aya", "ye", "woo", "ma" };
		String match = "[0-9]";

		for (int i = 0; i < babbling.length; i++) {
			String target = babbling[i];
			for (int j = 0; j < can.length; j++) {
				String tmp = target;
				String value = String.valueOf(j);
				tmp = tmp.replaceAll(can[j], value);
				if (!tmp.contains(value + value)) {
					target = tmp;
				}
			}

			String end = target.replaceAll(match, "");
			if (end.equals("")) {
				answer++;
			}
		}

		return answer;
	}
}
