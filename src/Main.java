import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	/*
	 * Given a string of round, curly, and square open and closing brackets, 
	 * return whether the brackets are balanced (well-formed).
	 * For example, given the string "([])[]({})", you should return true.
	 * Given the string "([)]" or "((()", you should return false.
	 */

	public static void main(String[] args) {
		
		String example = "{()[]{}}";

		System.out.println(isBalanced(example));
	}
	
	public static boolean isBalanced(String brackets) 
	{
		String[] elements = brackets.split("");
		
		ArrayList<String> listOfOpened = new ArrayList<String>();
		
		HashMap<String,String> mapPairs = new HashMap<String, String>();
		mapPairs.put("(", ")");
		mapPairs.put("[", "]");
		mapPairs.put("{", "}");
		
		for(int i = 0; i < elements.length; i++) 
		{
			if(mapPairs.containsKey(elements[i])) 
			{
				listOfOpened.add(elements[i]);
			}else 
			{
				if(!listOfOpened.isEmpty()) 
				{
					String lastOpened = listOfOpened.get(listOfOpened.size() - 1);
					if(elements[i].equals(mapPairs.get(lastOpened))) 
					{
						listOfOpened.remove(listOfOpened.size() - 1);
					}
				}else 
				{
					return false;
				}
			}
		}
		
		if(listOfOpened.isEmpty()) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	


}
