package StremApi;

import java.util.ArrayList;

public class TreverseExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Ashleeldude");
		l.add("AshleelKingdom");
		l.add("nastygag");
		l.add("ashleelbillu");
		for(String k : l) {
		System.out.println(k  );
		
		StringBuffer br = new StringBuffer(k);
		//StringBuilder br = new StringBuilder(k);
		
		//System.out.println(br.reverse());
		//System.out.println(br.capacity());
		System.out.println(br.indexOf(k));
	}
	}

}
 