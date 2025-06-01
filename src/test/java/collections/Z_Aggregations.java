package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Z_Aggregations {

	public static void main(String[] args) {
		// 
		Collection<Integer> c = new ArrayList<>();
		for(int i=0;i<=16;i++) {
			c.add((int)(Math.random()*100));
		}
		System.out.println(c);
		
		long count = c.stream().count();
		System.out.println(count);
		long dcount = c.stream().distinct().count();
		System.out.println(dcount);
		c.stream().sorted().forEach(d->{System.out.print(d+" ");});
		String joined = c.stream()
				.filter(e->e>=25)
				.map(Object::toString)
				.collect(Collectors.joining("-"));
		System.out.println(joined);
		int total = c.stream()
					.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(total);
		
	}

}
