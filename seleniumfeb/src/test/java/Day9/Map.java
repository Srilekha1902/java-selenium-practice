package Day9;

import java.util.LinkedHashMap;

public class Map {
	
	//map is the merge of list and set 
	//values duplicates allowed 
	//key is unique
	//no insertion order is maintained
	
	
	public static void LinkedHashMapType(){
		
		LinkedHashMap<String,Integer> stud=new LinkedHashMap<String,Integer>();
		
		stud.put("English", 90); //here in map instaed of usingg add we use put method
		stud.put("Tamil", 70); 
		stud.put("maths", 93); 
		stud.put("science", 94); 
		
		System.out.println("The size of stud:");
		System.out.println(stud.size());
		//Duplicates will be not allowed 
		stud.put("Tamil", 70);
		
	   System.out.println("To print values with key use enhanced for loop");
	   for(String a: stud.keySet()) {
		   System.out.println(a+" "+stud.get(a));
	   }
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map.LinkedHashMapType();
	}

}
