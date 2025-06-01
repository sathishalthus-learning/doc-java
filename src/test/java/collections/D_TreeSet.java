package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class D_TreeSet {

	public static void main(String[] args) {
		// constructor
		TreeSet<Integer> set1 = new TreeSet<>();
		//
		for(int i=10;i>=1;i--) {
			set1.add(i);
		}
		System.out.println(set1);
		
		//methods
		System.out.println(set1.first());
		System.out.println(set1.ceiling(3));
		System.out.println(set1.floor(3));
		System.out.println(set1.higher(3));
		System.out.println(set1.lower(3));
		
		// iterators
		//descendingIterator
		System.out.println("\nDesc Iterator");
		Iterator<Integer> di = set1.descendingIterator();
		while(di.hasNext()) {
			System.out.print(di.next() +" ");
		}
		// Iterator
		System.out.println("\nIterator");
		Iterator<Integer> i = set1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() +" ");
		}
		
		// headset, tailset, subSet
		System.out.println("\nHeadSet Tailset");
		System.out.println(set1.headSet(5));
		System.out.println(set1.tailSet(5));
		System.out.println(set1.subSet(3,7));
		
		// pollFirst, pollLast
		set1.pollFirst();
		set1.pollLast();
		System.out.println(set1);
		
	}

}
