package basic.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class RemoveDups {
	static int sum = 0;

	public static int sumArr(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
		}
		return sum;
	}

	public static ArrayList<Integer> removedup1(ArrayList<Integer> a) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.addAll(a);
		a.clear();
		a.addAll(lhs);
		return a;
	}

	public static ArrayList<Integer> removedup2(ArrayList<Integer> a) {

		ArrayList<Integer> newl = new ArrayList<>();
		for(Integer s :a){
			
			if(!newl.contains(s)){
					newl.add(s);
				
			}
		}
		
		return newl;
	}

	public static void method1() {

		ArrayList<Integer> hh = new ArrayList<Integer>();
		ArrayList<Integer> gg = new ArrayList<Integer>();
		hh.add(1);
		hh.add(1);
		hh.add(1);
		hh.add(1);
		hh.add(1);
		hh.add(1);
		hh.add(1);

		/*
		 * for (Integer tt : hh) {
		 * 
		 * System.out.println(tt);
		 * 
		 * }
		 */

		System.out.println(hh);

		int sz = hh.size();
		System.out.println("--------");
		for (int i = 0; i < hh.size(); i++) {
			if (hh.get(0) * hh.size() == sumArr(hh)) {
				ListIterator<Integer> e = hh.listIterator();
				e.next();
				while (e.hasNext()) {

					hh.remove(e.nextIndex());
				}
				break;
			} else {
				int f = hh.get(i);
				int p = 0;
				for (int j = 0; j < hh.size(); j++) {
					if (f == hh.get(j)) {
						p++;
						if (p > 1) {
							hh.remove(j);
						}
					}
				}
				for (Integer g : gg) {
					hh.remove(g);
				}

			}

		}

		ListIterator<Integer> li = hh.listIterator();
		while (li.hasNext()) {

			System.out.println(li.next());
		}

	}

	public static void method2() {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1));
		System.out.println(al);
		System.out.println("----");
		System.out.println(removedup1(al));

	}

	public static void method3() {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 1, 2, 1, 1));
		System.out.println(al);
		System.out.println("----");
		System.out.println(removedup2(al));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method3();
	}

}
