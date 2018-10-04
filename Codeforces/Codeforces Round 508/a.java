import java.util.Arrays;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		int[] a = new int[k];
		for(int i = 0; i<n; i++){
			a[s.charAt(i)-'A']++;
		}
		Arrays.sort(a);
		System.out.println(a[0]*k);

	}

}
