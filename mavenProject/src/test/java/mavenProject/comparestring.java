package mavenProject;

public class comparestring {

	public static void main(String[] args) {
		String s="Dan";
		String s1="Dan";
		String s3="Danish";
		String s4=new String("Danish");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s3));
		
		
		System.out.println(s3.equals(s4));

	}

}
