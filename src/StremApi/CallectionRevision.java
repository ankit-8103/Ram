package StremApi;
import java.util.*;
public class CallectionRevision {

	public static void main(String[] args) {
		/*
		 * creation collection
		 * 
		 * type safe - same type off element (object)add colection.
		 * un type safe-  diffrent type object add collection.
		 * 
		 */
		
		
		ArrayList<String> s =new ArrayList<>();
		s.add("ram"); 
		s.add("Shyam");
		s.add("ramu"); 
		for(String  d : s)
		System.out.println(d);
		
		s.set(0, "mahi");
		System.out.println(s);
		
	
		Vector<String> r = new Vector<>();
		
		r.addAll(s);
		System.out.println(r);
		
		HashSet<Integer> k = new HashSet<>();
		
		k.add(34);
		k.add(67);
		k.add(45);
		k.add(67);
		System.out.println(k);
		
		
		
		
		
		
	} 
	
	
}
