package com.ct.test.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : 기사단원의 무기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */

public class KnightlyWeapon {

	public static void main(String[] args) {

		int number = 5;
		int limit = 3;
		int power = 2;

		int sol = sol(number, limit, power);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int number, int limit, int power) {
		int answer = 0;

		for (int i = 1; i <= number; i++) {
			List<Integer> mul = multiple(i);

			int size = mul.size();
			if (size > limit) {
				size = power;
			}

			answer += size;
		}

		return answer;
	}

	public static List<Integer> multiple(int n) {
		int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
		ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) { // 약수 중 작은 수 저장
				arr.add(i);
				if (n / i != i) { // 약수 중 큰 수 저장
					arr.add(n / i);
				}
			}
		}
		return arr;
	}
}
