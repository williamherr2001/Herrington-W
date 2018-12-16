import java.util.Arrays;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n;i++) {
			String s = in.next();
			char[] c = s.toCharArray();
			Arrays.sort(c);
			StringBuilder str = new StringBuilder(c[0]+"");
			for(int j = 1; j<s.length();j++) {
				str=new StringBuilder(str.append(c[j]));
			}
			s= str.toString();
			
			if(s.equals(str.reverse().toString())) {
				System.out.println(-1);
			}else System.out.println(s);
		}

	}

}
