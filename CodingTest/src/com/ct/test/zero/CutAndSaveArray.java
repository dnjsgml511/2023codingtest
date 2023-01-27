package com.ct.test.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lwh
 * @제목 : 잘라서 배열로 저장하기
 * @링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */

public class CutAndSaveArray {

	public static void main(String[] args) {

		String my_str = "abc1Addfggg4556b";
		int n = 6;

		List<String> sol = sol(my_str, n);

		System.out.println(" -- Sol --");
	}

	public static List<String> sol(String my_str, int n) {

		List<String> list = new ArrayList<String>();
		while (my_str.length() > n) {
			String cut = my_str.substring(0, n);
			my_str = my_str.substring(n);
			list.add(cut);
		}
		
		list.add(my_str);
		
		System.out.println(list);

		return list;
	}

}
