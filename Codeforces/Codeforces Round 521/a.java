import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n; i++){
			long a = in.nextInt();
			long b = in.nextInt();
			long k = in.nextInt();
			long x = 0;
			if(k%2==0)x=k/2*a-k/2*b;
			else x=(k/2+1)*a-(k/2)*b;
			System.out.println(x);
		}

	}

}
