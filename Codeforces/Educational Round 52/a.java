import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n;i++){
			long s = in.nextInt(),a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
			System.out.println(s/c+s/c/a*b);
		}

	}

}
