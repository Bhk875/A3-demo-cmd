package com.cg.cmdDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CmdDemo {

	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		 Iterator iter = li.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());

	}

}
}
