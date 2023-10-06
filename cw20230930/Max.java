import java.util.Scanner;
public class Max{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int [n];
		for ( int i = 0; i< n; i++){
			a[i] = scan.nextInt();
		}

		int max = a[0];
		for (int i = 1; i<= n-1; i++){
			if (a[i]>max){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}