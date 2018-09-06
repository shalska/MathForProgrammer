/**
 * 프로그래머를 위한 기초수학 - 0002 집합
 * 
 * 본 소스는 프로그래머를 위한 기초수학을 위해 작성되었습니다. 
 * 본 소스에 대한 모든 권리는 제작자에게 있습니다.
 *  
 * Made by shalska
 * 2018/09/03
 */

package kr.co.knowch.MathForProgrammer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex0002Set {

	public static void main(String[] args) {
		// List 
//		printList();
		
		// Set
//		printSet();
		
		// Map
		printMap();
	}
	
	public static void printList() {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김철수");
		list.add("이영희");
		list.add("홍길동");

		// 리스트의 크기 출력
		System.out.println("size = " + list.size());
		System.out.println();
		
		// 리스트 내용 출력 (index)
		for(int i = 0; i < list.size(); ++i) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		// 리스트 내용 출력 (foreach)
		int j = 0;
		for(String item : list) {
			System.out.println(j++ + " : " + item);
		}
		System.out.println();
		
		// 리스트 element 삭제
		list.remove(0);
		for(int i = 0; i < list.size(); ++i) {
			System.out.println(i + " : " + list.get(i));
		}		
		
		// 데이터 포함여부 확인
		if(list.contains("김철수")) {
			System.out.println("김철수 있음");
		}
		
	}
	
	public static void printSet() {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김철수");
		set.add("이영희");
		set.add("홍길동");			// 추가 안됨
		
		// set의 크기 출력
		System.out.println("size = " + set.size());
		System.out.println();
		
		// set 내용 출력
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		// set element 삭제
		set.remove("홍길동");
		for(String item : set) {
			System.out.println(item);
		}		
		System.out.println();
		
		// 데이터 포함여부 확인
		if(set.contains("김철수")) {
			System.out.println("김철수 있음");
		}
						
	}
	
	public static void printMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 18);
		map.put("김철수", 21);
		map.put("이영희", 20);
		map.put("홍길동", 25);			// 기존의 홍길동을 덮어씀
		
		// 맵의 크기 출력 
		System.out.println("size = " + map.size());
		System.out.println();
		
		// key로 데이터 접근
		System.out.println("김철수의 나이 : " + map.get("김철수"));
		System.out.println();
		
		// map의 내용 출력
		for(String key : map.keySet()) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		System.out.println();
		
		// 데이터 삭제
		map.remove("김철수");
		for(String key : map.keySet()) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		System.out.println();
		
		// 데이터 포함여부 key
		if(map.containsKey("김철수")) {
			System.out.println("철수 안녕?");
		} else {
			System.out.println("철수 없다");
		}
		System.out.println();
		
		// 데이터 포함여부 value
		if(map.containsValue(25)) {
			System.out.println("25살 목록");
			for(String key : map.keySet()) {
				if(map.get(key) == 25) {
					System.out.println("key : " + key + ", value : " + map.get(key));
				}
			}
		}
	}

}
