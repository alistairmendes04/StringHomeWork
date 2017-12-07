package stringHomeWork;

public class StringHW {

	public static void main(String[] args) {
		
		String a="Hello people from the universe. Welcome to planet earth";
		String b=" World ";
		String c="";
		
		System.out.println(a.length());
		System.out.println(a.charAt(20));
		System.out.println(a.substring(32, a.length()));
		System.out.println(a.indexOf(a));
		System.out.println(a.substring(6));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains(b));
		System.out.println(a.equals(b));
		System.out.println(b.hashCode());
		System.out.println(c.isEmpty());
		System.out.println(a.replace("h", "t"));
		System.out.println(a.startsWith("H"));
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(b.trim());
		System.out.println(a.toUpperCase());
		
	}

}
