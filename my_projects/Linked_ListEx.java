package my_projects;

import java.util.LinkedList;
import java.util.List;

public class Linked_ListEx{

	public static void main(String[] args) {
	
	List<Integer> s = new LinkedList<Integer>();
	List<Object> s1 =new LinkedList<Object>();
	
	s.add(23);
	s.add(489);
	s.add(78);
	s.add(213);
	
	s1.add("Linked");
	s1.add(489);
	s1.add(true);
	s1.add(23);
	
	System.out.println(s);
	System.out.println(s1);
	
	int size=s1.size();
	System.out.println(size);
	
	boolean contains=s1.contains(489);
	System.out.println(contains);
	
	Object obj=s1.get(0);
	System.out.println(obj);
	
	s.set(2, 67);
	System.out.println(s);
	
	s.remove(0);
	System.out.println(s);
	
	int b= s1.indexOf(2);
	System.out.println(b);
	
	boolean e=s1.contains(23);
	System.out.println(e);
	
	//s.clear();
	//System.out.println(s);
	
	s1.addAll(s);
	System.out.println(s1);
	
	s.retainAll(s1);
	System.out.println(s);
	
	s1.removeAll(s);
	System.out.println(s1);
	
	}

}
