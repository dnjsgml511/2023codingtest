package com.ct.test.zero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : 한 번만 등장한 문자
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */

public class UniqueWord {

	public static void main(String[] args) {

		String s = "hello";

		String sol = sol(s);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(String s) {
		String answer = "";
		
		List<String> list = new ArrayList<String>();

		while (s.length() != 0) {
			int beforeLength = s.length();
			String firstWord = s.substring(0, 1);
			s = s.replace(firstWord, "");
			
			if(s.length() + 1 == beforeLength) {
				list.add(firstWord);
			}
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}

		return answer;
	}

}
