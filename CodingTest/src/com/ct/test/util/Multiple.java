package com.ct.test.util;

import java.util.ArrayList;
import java.util.List;

public class Multiple {

	// 약수 목록
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
