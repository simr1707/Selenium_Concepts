package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 1; i<=10; i=i+2) {
		System.out.println(i);
	    }*/
	
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			
		    if(i==5) {
				System.out.println("got 5");
				break;
			}
		}
		
		

	}

}
