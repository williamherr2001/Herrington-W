import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = Integer.toBinaryString(n).length();
		System.out.println(s);
	}

}
