package tests;

public class IfConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 20;
		int b= 10;
		
		if(a==b){
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
		}
		
		String expected = "selenium";
		String actual = "selenium";
		
		if(expected.equals(actual)) {
			System.out.println("equal");//use .equals instead of == for string
		}else {
			System.out.println("not equal");
		}


	}

}
