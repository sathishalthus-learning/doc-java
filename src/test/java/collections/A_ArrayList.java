package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_ArrayList {

	public static void main(String[] args) {
		// constructors
		List<Integer> list = new ArrayList<>(); // default init
		List<Integer> list2 = new ArrayList<>(15); // init with capacity
		// add
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		List<Integer> list3 = new ArrayList<>(list);
		
		
		//
		System.out.println("List Items:" + list);
		System.out.println("List Size:" + list.size());
		
		// get, contains
		System.out.println("Get List Item:" + list.get(2)); // index
		System.out.println("Contains Item:" + list.contains(3));
		
		//loop thru
		// for each
		System.out.print("\nForEach : ");
		list.forEach(item->{
			System.out.print(item + " ");
			});
		
		//iterator
		System.out.print("\nIterator : ");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		//list iterator
		System.out.print("\nList Iterator : ");
		Iterator<Integer> lIterator = list.listIterator();
		while(lIterator.hasNext()) {
			System.out.print(lIterator.next()+" ");
		}
		
		// operations
		System.out.println("\n\nCurrent List : "+ list);
		list.remove(3); // index
		System.out.println("after remove : " + list);
		list.add(3, 8); // insert
		System.out.println("after add at specific location : " + list);
		list.set(3, 7);
		System.out.println("After replacing : "+ list);
		System.out.println("Is Empty : "+ list.isEmpty());
		list3.clear();
		System.out.println("After clear List3 : " + list3);
		
		//conversions
		// toArray
		Object[] items = list.toArray();
		System.out.println("Objects : " + items);
		// sub list
		List<Integer> sublist= list.subList(0, 5);
		System.out.println("Sub List : " + sublist);
		
		System.out.println("Capacity : "+ list2.size());
		
		// ordering
//		System.out.println(list.sort(null));
		
		
		// capacity
		// ensureCapacity
		// trimToSize
		
		
		
		
		

	}

}
