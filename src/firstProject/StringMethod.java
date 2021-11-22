package firstProject;

public class StringMethod {

	public static void main(String[] args) {
     String T = "Have a good day";
     int length = T.length();
     System.out.println(length);
     boolean equals = T.equals("HaVe a good day");
System.out.println(equals);
boolean equalsIgnoreCase = T.equalsIgnoreCase("Have A GOOD DAY");
System.out.println(equalsIgnoreCase);
String upperCase = T.toUpperCase();
System.out.println(upperCase);
String lowerCase = T.toLowerCase();
System.out.println(lowerCase);
boolean contains = T.contains("good");
System.out.println(contains);
char charAt = T.charAt(12);
System.out.println(charAt);
String replace = T.replace("Have", "got");
System.out.println(replace);
String replace2 = T.replace('a', 's');
System.out.println(replace2);
String substring = T.substring(3);
System.out.println(substring);
String substring2 = T.substring(2, 10);
System.out.println(substring2);

	}
}
