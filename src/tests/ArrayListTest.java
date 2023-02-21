package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Junit");
		tools.add("Testing");
		tools.add("Agile");
		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("git");
		System.out.println(tools.size());
		System.out.println(tools.get(4));
		
		tools.remove(2);
		System.out.println(tools.get(2));
		System.out.println(tools.size());
		
		System.out.println("-----------------------");
		
		for(int i=0; i< tools.size(); i++) {
		System.out.println(tools.get(i));
		
		for (String s : tools) {
			System.out.println(s);
		}
		}
		
		
	}

}
