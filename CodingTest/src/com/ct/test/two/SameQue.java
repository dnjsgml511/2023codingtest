package com.ct.test.two;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author lwh
 * @제목 : 두 큐 합 같게 만들기
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/118667
 */

public class SameQue {

	public static void main(String[] args) {

		int[] queue1 = { 1, 1 };
		int[] queue2 = { 1, 5 };

		int sol = sol(queue1, queue2);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[] queue1, int[] queue2) {
		int answer = -1;

		Queue<Integer> que1 = new LinkedList<Integer>();
		Queue<Integer> que2 = new LinkedList<Integer>();

		for (int i = 0; i < queue1.length; i++) {
			que1.add(queue1[i]);
			que2.add(queue2[i]);
		}

		int sum1 = -1, sum2 = -2;

		int loop = queue1.length * 2 + queue2.length * 2;

		sum1 = que1.stream().reduce(0, (total, n) -> total + n);
		sum2 = que2.stream().reduce(0, (total, n) -> total + n);

		while (sum1 != sum2) {
			if (sum1 > sum2) {
				int poll = que1.poll();
				sum1 -= poll;
				sum2 += poll;
			} else {
				int poll = que2.poll();
				sum2 -= poll;
				sum1 += poll;
			}

		}

		return answer;
	}

}
