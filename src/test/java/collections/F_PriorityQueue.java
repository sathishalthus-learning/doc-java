package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class F_PriorityQueue {

	public static void main(String[] args) {
		// 
		Queue<Integer> queue1 = new PriorityQueue<>();
		for(int i=1;i<=10;i++) {
			queue1.add(i);
		}
		System.out.println(queue1);
		
		// methods
		// add, offer
		queue1.add(10);
		queue1.offer(11);
		System.out.println(queue1);
		// element, peek
		System.out.println(queue1.element());
		System.out.println(queue1.peek());
		// remove, poll
		queue1.remove();
		queue1.peek();
		System.out.println(queue1);
		// iterator
		Iterator<Integer> qi = queue1.iterator();
		while(qi.hasNext()) {
			System.out.print(qi.next()+" ");
		}
	}

}
