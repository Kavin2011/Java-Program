package my_projects;

import java.util.ArrayList;
import java.util.List;

public class List_CoceptEx {

	public static void main(String[] args) {
	
	List<Integer> r = new ArrayList<Integer>();
	List<Object> r1 = new ArrayList<Object>();
	
	r1.add(123);
	r1.add(86);
	r1.add("List");
	r1.add(false);
	
	r.add(86);
	r.add(178);
	r.add(123);
	r.add(33);
	
	System.out.println(r);
	System.out.println(r1);
	
	int size= r1.size();
	System.out.println(size);
	
	Object object = r1.get(3);
	System.out.println(object);
	
	r1.set(2, "Array List");
	System.out.println(r1);
	
    int a=r1.indexOf(2);
	System.out.println(a);
	
	boolean v=r1.contains(86);
	System.out.println(v);
	
	}
}
