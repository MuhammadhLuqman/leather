package firstProject;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("hello");
		try {
			System.out.println(10/0);
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally {
		System.out.println("isissj");
		
	}

}
}