package Day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionList {
	
	//List is ineterface 
	//so we cannot create object for nterface we need class thats called of two types 
    //ArrayList 
	//LinkedList
	
  //points to remember 
	//list allow duplicstes 
	//list is user defined
	//list allow any data types 
	// list is index based 
	//list can be used to increase or decreease the size
	
	
	//Linked list also same type of the arrayList the only diffrence is execution time
	
	public static void list() {
	//this is how to craete object for array list
		
     LinkedList<String> names=new LinkedList<String>();//user defined the data type
     
     names.add("Srilekha1");
     names.add("Preethi2");
     names.add("Harikaran3");
     names.add("Senthazhini4");
     
     System.out.println(names.size());
     
     names.add("madhavan5");    //size can be increased 
     System.out.println(names.size());
     names.remove("Srilekha1"); //can remove name 
     System.out.println(names.size()); 
     names.add("madhavan5");   //duplicats allowed
     System.out.println(names.size()); 
     System.out.println(names.get(0));//index based
     
     //Specifically if you want to add in first index 
     names.add(1,"hema");
   
     
     for(String a: names)
     {
    	 System.out.println(a); //will get all the names
     }
     System.out.println(" ");

     System.out.println("The reverse string:");
     
     //to use tradional for loop to print the names in reverse
     
     for(int i=names.size()-1;i>=0;i--) //use size instead of length
     {
    	System.out.println(names.get(i)); //use get instead of charAt
     }
     
     
     //any data type example
     
     LinkedList<Object> an=new LinkedList<Object>();
     System.out.println(" ");
     System.out.println("The data types are:");
     an.add(1);
     an.add("Sri");
     an.add(1263.11);
     an.add(true);
     an.add(123.233);

   for(Object a: an)
   {
	   System.out.println(a);
   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionList.list();
	
	}

}
