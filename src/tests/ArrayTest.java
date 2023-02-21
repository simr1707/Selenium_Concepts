package tests;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String tool = "Selenium";  //single string
		System.out.println(tool);*/
		
		String tools[] = {"selenium", "java", "junit","maven"}; //array for multiple strings
		System.out.println(tools.length);
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println("-------------");

		for(int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}
	}
	

}
