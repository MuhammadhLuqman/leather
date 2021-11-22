package firstProject;

public class Robot implements Gunner {

	
	@Override
	public void hunter() {
		System.out.println("james");
	}

	@Override
	public void shooter() {
		System.out.println("bond");
	}
public static void main(String[] args) {
		Robot rt = new Robot();
		rt.hunter();
		rt.shooter();
		
	}


}
