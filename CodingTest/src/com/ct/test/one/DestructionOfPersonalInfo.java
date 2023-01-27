package com.ct.test.one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : 개인정보 수집 유효기간
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/150370
 */

public class DestructionOfPersonalInfo {

	public static void main(String[] args) {

		String today = "2020.01.01";
		String[] terms = { "Z 3", "D 5" };
		String[] privacies = { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" };

		List<Integer> sol = sol(today, terms, privacies);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static List<Integer> sol(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<Integer>();

		String now = today.replaceAll("\\.", "-");
		LocalDate nowTime = LocalDate.parse(now);

		HashMap<String, Integer> termMap = new HashMap<>();
		for (String t : terms) {
			String[] split = t.split(" ");
			termMap.put(split[0], Integer.parseInt(split[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] split = privacies[i].split(" ");
			String date = split[0].replaceAll("\\.", "-");
			LocalDate checkTime = LocalDate.parse(date);

			checkTime = checkTime.plusMonths(termMap.get(split[1]));

			if (checkTime.isBefore(nowTime)) {
				answer.add(i + 1);
			}
		}

		return answer;

	}

}
