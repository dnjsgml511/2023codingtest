package com.ct.test.one;

/**
 * 
 * @author lwh
 * @제목 : 햄버거 만들기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */

public class MakeBuger {

	public static void main(String[] args) {

		int[] ingredient = { 1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 };

		int sol = sol(ingredient);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[] ingredient) {
		int answer = 0;

		StringBuffer sb = new StringBuffer();
		for (int i : ingredient) {
			sb.append(i);
			if (sb.length() >= 4) {
				String cut = sb.substring(sb.length() - 4);
				if (cut.equals("1231")) {
					answer++;
					sb.setLength(sb.length() - 4);
				}
			}
		}

		return answer;
	}
}
