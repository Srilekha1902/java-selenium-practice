package Revision;

public class ArrayMethods {
	
	//To create an array of 5 integer
	public static void main(String[] args) {
	int[] num= {12,13,14,15};
	System.out.println("The elements are:");
    for(int i = 0;i<num.length;i++)
    	System.out.println(num[i]);
    
	//To find length of array
    String[]fruit= {"Apple"};
    System.out.println("The length of the fruit:" + fruit.length);
    
  	//To find index of array
    String[] employee={"Srilekha","jshhd","iasdh"};
    System.out.println("the index of :" + employee.length );
    
   //To use equals
    String google="Srilekha Google";
    String google2="srilekha Google";
    System.out.println(google.equalsIgnoreCase(google2));
    
    //To use touppercase 
    String s1="java";
    System.out.println(s1.toUpperCase());
    
    String s2="JAVA";
    System.out.println(s2.toLowerCase());
    
    String carrot="Orange colour";
    System.out.println(carrot.split("colour"));
    
    String veg="beans, green";
    System.out.println(veg.split(","));//split
    
    String [] starters={"chicken gravy , mutton gravy ","dosa"};
    System.out.println(starters[2]);//to know index position
    

    String starters2 ="chicken gravy2";
    System.out.println(starters.length);//length
    
    String quote="hey you're beautiful";
    System.out.println(quote.trim());//trim
    

	}
	

	
	
    

}
