package com.test.basic.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestForLoopIterator {

	public static void main(String[] args) {
		List<String> gadgets = new ArrayList<>(Arrays.asList("Apple watch", "Samsung Gear 3", "iPhone 7+"));

		// Throw concurrent modification Excepttion

		for (String gadget : gadgets) {
			gadgets.add("jawahar");
			System.out.println(gadget);
		}

		for (int i = 0; i < gadgets.size(); i++) {
			// gadgets.add("jawahar");
			System.out.println(gadgets.get(i));
		}

		// You might need to use iterators if you need to modify collection in
		// your loop.
		// First approach will throw exception.

		for (String i : gadgets) {
			System.out.println(i);
			gadgets.remove(i); // throws exception
		}

		Iterator it = gadgets.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); // valid here
		}

	}
}
