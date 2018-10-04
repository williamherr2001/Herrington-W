import java.util.Scanner;

public class seating {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i<n; i++){
			int p = in.nextInt();
			int d = in.nextInt();
			int fctrl = 1;
			for(int j = 1; j<=p-1; j++){
				fctrl*=j;
			}
			fctrl*=d;
			System.out.println("Data set #"+(i+1)+": "+fctrl+" combination(s) possible.");
		}

	}

}
