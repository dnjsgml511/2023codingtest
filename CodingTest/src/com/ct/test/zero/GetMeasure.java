package com.ct.test.zero;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author lwh
 * @제목 : 약수 구하기
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */

public class GetMeasure {

	public static void main(String[] args) {

		int n = 24;

		ArrayList<Integer> sol = sol(n);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static ArrayList<Integer> sol(int n) {
		int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
		ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList

		for(int i = 1; i <= sqrt; i++){
		   if(n % i == 0){ // 약수 중 작은 수 저장
		    arr.add(i);
		        if(n / i != i){ // 약수 중 큰 수 저장
		            arr.add(n / i);
		        }
		    }
		}
		// Java 8 이후 사용 가능
		Collections.sort(arr);

        return arr;
	}

}
