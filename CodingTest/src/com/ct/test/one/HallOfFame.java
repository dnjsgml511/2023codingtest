package com.ct.test.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @author lwh
 * @제목 : 명예의 전당 (1)
 * 
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

public class HallOfFame {

	public static void main(String[] args) {

		int k = 3;
		int[] score = { 10, 100, 20, 150, 1, 100, 200 };

		List<Integer> sol = sol2(k, score);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static List<Integer> sol(int k, int[] score) {
		List<Integer> answer = new ArrayList<>();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			list.add(score[i]);
			if (list.size() > k) {
				int min = Collections.min(list);
				list.remove((Object) min);
			}

			answer.add(Collections.min(list));
		}

		return answer;

	}

	public static List<Integer> sol2(int k, int[] score) {
		List<Integer> answer = new ArrayList<>();

		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (Integer num : score) {
			
			System.out.println(que);
			
			que.add(num);

			if (que.size() > k) {
				que.poll();
			}
			
			answer.add(que.peek());
		}

		return answer;

	}

}
