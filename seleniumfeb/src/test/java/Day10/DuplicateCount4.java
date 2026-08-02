package Day10;

import java.util.LinkedHashMap;

public class DuplicateCount4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hemamalinis";
		char[] ch=s.toCharArray();
		LinkedHashMap<Character, Integer> maps=new LinkedHashMap<Character,Integer>();
		
		for(Character a:ch)
		{
		if(maps.containsKey(a))
			{
				maps.put(a, maps.get(a)+1);
			}
			
		else {
			maps.put(a,1);
		}

	}
		System.out.println(maps);
}

}
