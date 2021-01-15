public class StringMethodsDemo {
	public static void main(String[] args) {
		String t1 = "Miracle software systems";
		String s1= "Miracle";
		String s2= "miracle";
		String s3 = "  Miraclesoft  ";
		
		System.out.println(t1.charAt(2));
		System.out.println(t1.concat("-Enjoy-"));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.equals(s1));
		System.out.println(t1.length());
		System.out.println(t1.replace("fun", "easy"));
		System.out.println(t1.substring(8));
		System.out.println(t1.substring(8, 12));
		System.out.println(t1.toLowerCase());
		System.out.println(t1.toUpperCase());
		System.out.println(s3.trim());
		System.out.println(t1.contains(s1));
		System.out.println(t1.contains(s2));

		char [] charArray = s2.toCharArray();
		System.out.println(charArray.length);
		System.out.println( charArray[3]);

	}

}