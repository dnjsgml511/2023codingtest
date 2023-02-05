package com.ct.test.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author lwh
 * @제목 : 푸드 파이트 대회
 * 
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */

public class OwnPassword {

	public static void main(String[] args) {

		String s = "aukks";
		String skip = "wbqd";
		int index = 5;

		String sol = sol(s, skip, index);

		System.out.println(" -- Sol --");
		System.out.println(sol);
	}

	public static String sol(String s, String skip, int index) {
		String answer = "";

		char[] sArray = s.toCharArray();
		char[] skipWords = skip.toCharArray();
		List<Character> skipList = IntStream.range(0, skipWords.length).mapToObj(i -> skipWords[i])
				.collect(Collectors.toList());

		for (int i = 0; i < index; i++) {
			for (int j = 0; j < sArray.length; j++) {
				if(sArray[j] == 'z') {
					sArray[j] = 'a';
				}else {
					sArray[j] += 1;
				}
				if (skipList.indexOf(sArray[j]) != -1) {
					if(sArray[j] == 'z') {
						sArray[j] = 'a';
					}else {
						sArray[j] += 1;
					}
				}
			}
		}

		return new String(sArray);
	}
}
