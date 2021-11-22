package firstProject;

import java.io.StringBufferInputStream;
import java.lang.invoke.StringConcatException;
import java.lang.invoke.StringConcatFactory;

public class Light {

	public static void main(String[]args) {
		

		StringBuffer s  = new StringBuffer ("red");
		StringBuffer s1 = new StringBuffer("blue");
		StringBuffer s2 = new StringBuffer("blue");
		
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));	
	System.out.println(System.identityHashCode(s2));
	
	StringBuffer append = s1.append(s);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	
	}
	
}