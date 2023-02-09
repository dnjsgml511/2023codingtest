package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 인덱스 바꾸기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */

public class ChangeIndex {

	public static void main(String[] args) {

		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;

		String sol = sol(my_string, num1, num2);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(String my_string, int num1, int num2) {
		char[] chars = my_string.toCharArray();
		char tmp = chars[num1];
		chars[num1] = chars[num2];
		chars[num2] = tmp;

		return new String(chars);
	}

}
