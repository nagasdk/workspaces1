
public class StringBuffer1 {

	public static void main(String[] args) {

		String s3 = "Value1";
		String s2 = "Value2";
		for (int i = 0; i < 100; ++i) {
		s3 = s3 + s2;
		}
		System.out.println(s3);
		
		StringBuffer s31 = new StringBuffer("Value1");
		String s21 = "Value2";
		for (int i = 0; i < 100; ++i) {
		s31.append(s21+i+";");
		}
		System.out.println(s31);
		
	}

}
