package Day9;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setlink {
	
	//set dupliactes will not be allowed 
	//insertion order is maintained.
	
	//Two types
	//linkedHashset
	//Hashset
	
	public static void setClass() {
		LinkedHashSet<String>names=new LinkedHashSet<String>();
		
		names.add("pineapple");
		names.add("watermelon");
		names.add("kiwi");
		names.add("orange");
	    
	    System.out.println(names.size());
	    
	    System.out.println(" ");
	    System.out.println("To list all the names:");
	    
	    System.out.println(" ");
	    System.out.println("One name added:");
	    names.add("berry"); //To increase the size
	    System.out.println(names.size());
	    
	    System.out.println(" ");
	    System.out.println("One name removed:"); 
	    names.remove("kiwi"); //To decrease the size
	    System.out.println(names.size());
	    
	    //duplicates
	    System.out.println(" ");
	    System.out.println("duplicates removed:"); 
	    names.add("berry"); //To decrease the size
	    System.out.println(names.size());
	    for(String a: names)
	    {
	    	System.out.println(a);//to get all the names listed
	    }
	    
	    LinkedHashSet<String> names1=new LinkedHashSet<String>();
	    names1.addAll(names);
		System.out.println(names1.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setlink.setClass();
		System.out.println("******");
	
	
		
	}

}
