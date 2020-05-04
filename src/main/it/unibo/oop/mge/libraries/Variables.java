package it.unibo.oop.mge.libraries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Variables {
	
	X("x"),
	Y("y"),
	Z("z"),
	A("a"),
	B("b"),
	C("c");
	
	private final String name;
	
	private Variables(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected static List<String> getListFromEnum() {
	  return Arrays.asList(Variables.values()).stream()
	                                          .map(e -> e.getName())
	                                          .collect(Collectors.toList());
	}
	
	public static Boolean constains(String name) {
	     return getListFromEnum().contains(name);
	}
}
