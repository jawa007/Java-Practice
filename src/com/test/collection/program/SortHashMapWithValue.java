package com.test.collection.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMapWithValue {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", "Jai");
		hm.put("b", "Vibhu");
		hm.put("c", "Rahul");
		hm.put("d", "Pankaj");

		// To Sort Using Key
		TreeMap<String, String> sorted = new TreeMap<>(hm);
		// To Sort Using Value
		Set<Entry<String, String>> entries = hm.entrySet();
		// Sort method needs a List, so let's first convert Set to List in Java
		List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries);

		Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
				String v1 = e1.getValue();
				String v2 = e2.getValue();
				return v1.compareTo(v2);
			}
		};
		// sorting HashMap by values using comparator
		Collections.sort(listOfEntries, valueComparator);
		LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
	}
}
