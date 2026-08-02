package seleniumfeb;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length()
		String a = "Srilekha Shanmugam";
		int c=a.length();
		System.out.println(c);

		//index
		String m ="Preethi Shanmugam";
		char ch=m.charAt(9);
		System.out.println(ch);
		
		//equals
		
		String s1 ="apple";
		String s2 ="Apple";
		System.out.println(s1.equals(s2));
		
		//ignore
		
		String s3 ="apple";
		String s4 ="Apple";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//trim
		
		String h = "hellooooo    ";
		System.out.println(h.length());
		
		String l =h.trim();   
		System.out.println(l.length());
		
		//tolowercase
		
		String k ="World";
		String u=k.toLowerCase();
		System.out.println(u);
		
		//uppercase
		String k1 ="world";
		String u1=k1.toUpperCase();
		System.out.println(u1);
		
		String h4="Srilekha Preethi";
		String l2=h4.substring(6);
		System.out.println(l2);
		
		//Array
		String [] name= {"Sri","Dhana","Babu"};
		String a8=name[2];
		System.out.println(a8);
		
		
		String [] name2= {"kani","nithya"};
		String b7=name2[1];
		System.out.println(b7);
		
		String [] name3= {"power","ranger","jack"};
	    String d2=name3[1];
		System.out.println(d2);
	    
	    String [] id= {"power1","ranger1","jack1"};
	    int b5=id.length;
	    System.out.println(b5);
	    
	    
	    String people="Shanmugam Hema";
	    String[] v=people.split(" ");
	    System.out.println(v[0]);
	    System.out.println(v[1]);
	    
	    //loop
	    //what datatype = string
	    //assign value by colon
	    //declaration name 
	    String [] names = {"sri","dhanam","babbu"};
	    for (String q: names) {
	    	System.out.println(q);
	    	
	    	
	    //Traditional for loop
	    //where to start '
	    //where to end
	    
	    for(int i =0;i<names.length;i++)
	    {
	    	System.out.println(names[i]);
	    }
	    

	    }
	}
}



