package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C_HashSet {

	public static void main(String[] args) {
		// constructors
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<Integer>(10);
		for(int i=1;i<=5;i++) {
			set1.add(i);
		}
		Set<Integer> set3 = new HashSet<Integer>(set1);
		System.out.println("Set1 :"+set1);
		System.out.println("Set2 :"+set2);
		System.out.println("Set3 :"+set3);
		
		// methods
		// add
		set1.add(6);
		System.out.println(set1);
		//isEmpty
		System.out.println("Set1 Empty ? "+ set1.isEmpty());
		System.out.println("Set2 Empty ? "+ set2.isEmpty());
		// size
		System.out.println("Set1 Size :" + set1.size());
		System.out.println("Set2 Size :" + set2.size());
		System.out.println("Set3 Size :" + set3.size());
		//contains
		System.out.println("contains 3 ? "+set3.contains(3));
		// remove
		set3.remove(1);
		System.out.println("After remove : "+ set3);
		set3.clear();
		System.out.println("After clear : " + set3);
		// iterator
		Iterator<Integer> si = set1.iterator();
		System.out.println("Iterator");
		while(si.hasNext()) {
			System.out.print(si.next()+" ");
		}
		set3.forEach(d->{
			System.out.println(d);
		});
		
	}

}
