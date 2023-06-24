package org.rest;

import java.util.ArrayList;
import java.util.List;

public class Classtwo {
public static void main(String[] args) {
	List l=new ArrayList();
	
	//add the values
	l.add(10);
	l.add(1000000000);
	l.add(46);
	l.add(67);
	l.add(1, 32);
	System.out.println(l);
	//set the values
	l.set(2, 154);
	System.out.println(l);
	// show the size of the values 
	System.out.println(l.size());
	boolean b = l.contains(46);
	System.out.println(b);
	boolean contains = l.contains(39);
	System.out.println(contains);
	// to show the index  by using values
	int indexOf = l.indexOf(67);
	System.out.println(indexOf);
	int lastIndexOf = l.lastIndexOf(67);
	System.out.println(lastIndexOf);
	List l1= new ArrayList();	
	l1.add(222);
	l1.add(987);
	l1.add(67);
	System.out.println(l);
	System.out.println(l1);
	l1.retainAll(l);
	System.out.println(l1);
	l1.removeAll(l);
	System.out.println(l1);
	
	System.out.println(l1);
	
}
}
