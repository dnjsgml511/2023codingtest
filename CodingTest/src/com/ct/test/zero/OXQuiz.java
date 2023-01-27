package com.ct.test.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : OX퀴즈
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

public class OXQuiz {

	public static void main(String[] args) {

		String[] babbling = { "3 - 4 = -3", "5 + 6 = 11" };

		List<String> sol = sol(babbling);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static List<String> sol(String[] quiz) {

		List<String> answer = new ArrayList<String>();

		for (String str : quiz) {
			String[] split = str.split(" ");

			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[2]);
			int res = Integer.parseInt(split[4]);

			String pm = split[1];

			String right = "X";
			if (pm.equals("+")) {
				if (a + b == res)
					right = "O";
			} else {
				if (a - b == res)
					right = "O";
			}

			answer.add(right);
		}

		return answer;
	}

}
