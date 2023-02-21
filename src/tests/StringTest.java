package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testing = "Automation";
		System.out.println(testing);
		
		String tool = "Selenium";
		System.out.println(tool);
		
		String space =" ";
		System.out.println(space);
		
		System.out.println(testing + tool);
		System.out.println(testing+" "+tool);
		System.out.println(testing + space+ tool);
		
		int a = 10;
		int b = 20;
		
		System.out.println(testing+tool+a+b);//AutomationSelenium1020
		System.out.println(a+b+testing+tool);//30AutomationSelenium
		System.out.println(testing+tool+(a+b));//AutomationSelenium30

	}

}
