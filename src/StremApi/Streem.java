package StremApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streem {
	
	public static void main(String[] args) {
	
		
		
	List<Integer> list1 = List.of(2,60,57,89,46);
	
	List<Integer> list2=new ArrayList<>();
	
	list2.add(12);
	
	list2.add(34);
	list2.add(67);
	
	List<Integer> list3= Arrays.asList(45,67,89);
	
	
	System.out.println(list1);
	System.out.println(list2);
	
	
	
	//using strem
	
	Stream<Integer> stream=list1.stream();
	List<Integer>newList=stream.filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println(newList);
	
	Stream<Integer> stream7 = list1.stream();
	List<Integer>list7=stream.filter(i->i%5==0).collect(Collectors.toList());
	
	
	System.out.println(list7);
	}

}
