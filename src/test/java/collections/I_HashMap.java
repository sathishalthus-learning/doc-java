package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class I_HashMap {

	public static void main(String[] args) {
		// 
		Map<String,Integer> map1 = new HashMap<>();
		int c=49;
		for (int i=1;i<=10;i++) {
			map1.put(Integer.toString(c), i);
			c++;
		}
		System.out.println(map1);
		
		// methods
		// get, remove,size, contains
		System.out.println(map1.get("58"));
		map1.remove("50");
		System.out.println(map1.containsKey("55"));
		System.out.println(map1.containsValue(5));
		
		// entrySet, keySet, values
		Set<Map.Entry<String,Integer>> es = map1.entrySet();
		System.out.println(es);
		Set<String> ks = map1.keySet();
		System.out.println(ks);
		Collection<Integer> v = map1.values();
		System.out.println(v);
		
		//iterators
		System.out.println("For Each : ");
		map1.forEach((key,value)->{
			System.out.println("Key : "+ key +" Value : "+value);
		});
		// value iterator
		System.out.print("\nValue iterator ");
		Iterator<Integer> vi = map1.values().iterator();
		while(vi.hasNext()) {
			System.out.print(vi.next()+" ");
		}
		// iterator keys
		System.out.print("\nKey iterator ");
		Iterator<String> ki = map1.keySet().iterator();
		while(ki.hasNext()) {
			System.out.print(ki.next()+" ");
		}
		// iterator entry
		System.out.print("\nEntry iterator ");
		Iterator<Map.Entry<String, Integer>> ei = map1.entrySet().iterator();
		while(ei.hasNext()) {
			System.out.print(ei.next() +" ");
		}
		//
		for(Map.Entry<String,Integer> e : map1.entrySet()) {
			System.out.println(e +" " +e.getKey()+" "+ e.getValue());
		}
}
}
