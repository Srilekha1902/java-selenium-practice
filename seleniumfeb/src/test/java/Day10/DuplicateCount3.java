package Day10;

import java.util.LinkedHashMap;

public class DuplicateCount3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="ajithvijaytrishashalini";
	char[] ch=s.toCharArray();
	LinkedHashMap<Character, Integer> maps=new LinkedHashMap<Character, Integer>();
	for(Character a: ch)
	{
		if(maps.containsKey(a))
	{
			maps.put(a, maps.get(a)+1);
	}
	else
	{
		maps.put(a, 1);
	}
	for(Character a1:maps.keySet())  //to print the character that appear more than once
		if(maps.get(a1)>1) {
		System.out.println(a1+"="+maps.get(a1));
		}
		
	}

}
	
}

