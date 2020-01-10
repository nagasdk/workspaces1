package stringops;


/*public class A1{
	public static final pr;
	public static final Str="epam";
	static{
		pr="xyz";
		System.out.println("xyz");
	}
	public static void test(){
		System.out.println("open"+Pg);
	}
			
}*/


public class TestSampleEPAM {

	public static void main(String[] args) {

		String s1 ="Buggy Bread";
		String s2 ="Buggy Bread";
		String s11 ="Buggy Bread";
		if(s1==s2) System.out.println("Buggy Bread -s1,s2equal");
		if(s1==s11) System.out.println("Buggy Bread -s1,s2equal");
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s11.hashCode());
		String s3 =  new String("Buggy Bread");
		String s4 =  new String("Buggy Bread");
		if(s3 == s4) System.out.println("equal");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		if(s1.equals(s2)) System.out.println("s1equalss2");
		if(s3.equals(s4)) System.out.println("s3equalss4");
		
		
	}
	
	public static int add(int x, int y){
		return x+y;
	}

	public static int add(int x, int y, int z){
		return x+y+z;
	}
	public static void add(float x, int y){
		System.out.println(x+y);
	}
	
	
	public static float add(float x, float y){
		return (x+y);
	}

	public static void add(int x, float y){


	}
	
	/*static int add(int x, float y){
		return x;
	}*/


}
