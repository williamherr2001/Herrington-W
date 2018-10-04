import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int maxSum=0;
		for(int i = 0; i<n; i++){
			int a = in.nextInt(), b = in.nextInt();
			if(a+b>maxSum)maxSum = a+b;
		}
		System.out.println(maxSum);

	}

}
