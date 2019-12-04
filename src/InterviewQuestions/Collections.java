package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<String>  al = new ArrayList<String> ();
		al.add("10");
		al.add("10");
		al.add("20");
		al.add("test");
		
		String s = al.get(2);
		System.out.println(al.get(2));
		System.out.println(al.size());
		
		HashSet <String> hs = new HashSet<String>();

		hs.add("java");
		hs.add("Sel");
		hs.add("Appium");
		hs.add("java");
		
		System.out.println(hs.size());
	}

}
