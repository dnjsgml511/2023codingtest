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

		int[] queue1 = { 3, 2, 7, 2 };
		int[] queue2 = { 4, 6, 5, 1 };

		int sol = sol(queue1, queue2);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static int sol(int[] queue1, int[] queue2) {
		int answer = 0;

		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();

		long sum1 = 0L;
		long sum2 = 0L;

		for (int i = 0; i < queue1.length; i++) {
			que1.add(queue1[i]);
			que2.add(queue2[i]);

			sum1 += queue1[i];
			sum2 += queue2[i];
		}

		while (sum1 != sum2) {
			if(answer > (queue1.length + queue2.length) * 2) {
				answer = -1;
				break;
			}
			answer++;
			if (sum1 > sum2) {
				int poll = que1.poll();
				que2.add(poll);
				sum1 -= poll;
				sum2 += poll;
			} else {
				int poll = que2.poll();
				que1.add(poll);
				sum2 -= poll;
				sum1 += poll;
			}
		}

		return answer;
	}

}
