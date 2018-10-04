import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i = 0; i<n; i++) {
			int m = in.nextInt();
			String s = in.next();
			char[] c = s.toCharArray();
			boolean tf = true;
			for(int j = 0, k = m-1;j<k;j++,k--) {
				if(Math.abs((c[j]+"").compareTo(c[k]+""))>2 ||Math.abs((c[j]+"").compareTo(c[k]+""))==1) {
					tf = false; 
					break;
				}
			}
			if(tf)System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
