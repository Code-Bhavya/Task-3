package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 2, 3, 2, 2, 2, 3, 5, 5, 3};

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		System.out.println("Elements are in : "+map);

		Map<Integer, Integer> sortedMap = sortByValue(map);

		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			System.out.println(""+entry.getKey() + " : " + entry.getValue());
		}

	}

	public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {
		List<Integer> valuesList = new ArrayList<>(map.values());
		List<Integer> keysList = new ArrayList<>(map.keySet());

		for (int i = 0; i < valuesList.size() ; i++) {
			for (int j = 0; j < valuesList.size(); j++) {
				if (valuesList.get(i) > valuesList.get(j)) {

					int tempValue = valuesList.get(i);
					valuesList.set(i, valuesList.get(j));
					valuesList.set(j, tempValue);

					int tempKey = keysList.get(i);
					keysList.set(i, keysList.get(j));
					keysList.set(j, tempKey);
				}
			}
		}
		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
		for (int i = 0; i < keysList.size(); i++) {
			sortedMap.put(keysList.get(i), valuesList.get(i));
		}
		return sortedMap;
	}
}
