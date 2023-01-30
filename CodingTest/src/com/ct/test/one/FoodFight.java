package com.ct.test.one;

/**
 * 
 * @author lwh
 * @제목 : 푸드 파이트 대회
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */

public class FoodFight {

	public static void main(String[] args) {

		int[] food = { 1, 3, 4, 6 };

		String sol = sol(food);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(int[] food) {

		StringBuffer sb = new StringBuffer();
		StringBuffer reverse = new StringBuffer();
		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i]/2; j++) {
				sb.append(i);
				reverse.append(i);
			}
		}
		
		reverse.reverse();
		
		return sb.append(0).append(reverse).toString();
	}
}
