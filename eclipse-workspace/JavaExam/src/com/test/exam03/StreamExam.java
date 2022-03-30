package com.test.exam03;


import java.util.List;
import java.util.stream.Stream;

public class StreamExam {
	
	List<String> list = Array.asList("abba", "chemical","brand");
	
	Stream<String> listStream = list.stream();
	System.out.println(listStream);
	
}
