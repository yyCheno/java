package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> s = new ArrayList<Integer>();
	s.add(5);
	s.add(1);
	s.add(6);
	s.add(8);
	Collections.reverse(s);
	for (Integer integer : s) {
		System.out.println(integer);
	}
	}
}
