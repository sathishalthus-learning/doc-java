package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class B_LinkedList {

	public static void main(String[] args) {
		// constructors
		LinkedList<Integer> list = new LinkedList<>(); // default init
		// add
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		LinkedList<Integer> list3 = new LinkedList<>(list);
		
		
		//
		System.out.println("List1 Items :" + list);
		System.out.println("List3 Items :" + list3);
		
		// operations
		// add, addFirst, addLast, addAll // offer, offerFirst, OfferLast
		list.add(6);		// at end
		list.add(3, 2);		// at position
		list.addFirst(0);	
		list.addLast(7);
		System.out.println(list);
		// get, getFirst, getLast // peek, peekFirst, peekLast
		System.out.println("Specific element :"+list.get(5));	// from postion
		System.out.println("First element :"+list.getFirst());
		System.out.println("Last element :"+list.getLast());
		// remove, removeFirst, removeLast // poll, pollFirst, pollLast
		System.out.println("Specific element :"+list.remove(5));	// from postion
		System.out.println("First element :"+list.removeFirst());
		System.out.println("Last element :"+list.removeLast());
		//push, pop, set
		
		//iterators
		//listIterator
		ListIterator<Integer> li = list.listIterator();
		System.out.print("\nList Iterator : ");
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		//descendingIterator
		Iterator<Integer> dl = list.descendingIterator();
		System.out.print("\nDesc Iterator : ");
		while(dl.hasNext()) {
			System.out.print(dl.next()+" ");
		}
	}

}
