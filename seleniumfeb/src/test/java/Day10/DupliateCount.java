package Day10;

import java.util.LinkedHashMap;

public class DupliateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hemalathashanmugam";
		char[] c=s.toCharArray();
		LinkedHashMap<Character, Integer> maps=new LinkedHashMap<Character,Integer>();
		
		for(Character a: c)
		{
		   if(maps.containsKey(a))
		{
			 maps.put(a,maps.get(a) +1);
		}
		
		else 
		{
			maps.put(a,1);
		}
	
		
     
	}
		System.out.println(maps);

	}
}
