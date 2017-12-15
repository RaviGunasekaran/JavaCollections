package com.test.Java.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Apple");
		s.add("Apple1");
		s.add("Apple2");
		System.out.println("SET print : " + s);

	}

}
