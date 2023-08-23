package StremApi;

import java.util.HashMap;

public class MapExample {
	
	
	public static void main(String[] args) {
//		 HashMap<String, Integer> sam = new HashMap<>();
//		 
//		 sam.put("BCA", 11000);
//		 sam.put("BA", 50000);
//		 
//		 
//		 System.out.println(sam);
//		sam.forEach((e1,e2)->{
//		
//			System.out.println(e1+" => "+e2);
//		}
//		);
		
		HashMap<String, Double> code = new HashMap<>();
		code.put("Ashleelkingdom", 900.00);
		code.put("nastygag", 300.00);
		
		
		System.out.println(code);
		code.forEach((e1,e2)->{
			
			System.out.println(e1+" - "+e2);
			
			
		});
		
		code.remove("nastygag");
		code.forEach((e3,e4)->{
			
			System.out.println(e3  +"  "+e4);
			
		});
		System.out.println();
				
	}
	}


