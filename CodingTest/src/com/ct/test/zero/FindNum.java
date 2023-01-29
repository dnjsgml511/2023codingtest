package com.ct.test.zero;

/**
 * 
 * @author lwh
 * @제목 : 숫자 찾기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */

public class FindNum {

	public static void main(String[] args) {

		int num = 29183;
		int k = 1;

		int sol = sol(num, k);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int num, int k) {
		
		int answer = String.valueOf(num).indexOf(String.valueOf(k));
		
		if(answer != -1) {
			answer++;
		}
		
		return answer;
	}

}
