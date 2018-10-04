import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%3==0 && n%9!=0){
			System.out.println(n/3+" "+(n/3)+" "+(n/3));
		}else if(n%3==1 || n%9==0){
			System.out.println(1+" "+1+" "+(n-2));
		}else{
			System.out.println(1+" "+2+" "+(n-3));
		}
	}

}
