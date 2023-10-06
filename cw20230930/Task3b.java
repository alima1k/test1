import java.util.Scanner;

public class Task3b{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the lenght of the number:");
		int n = scan.nextInt();
		int[] a1 = new int [n];
		System.out.println("Enter the number:");
		for (int i = 0; i < n; i ++){
			a1[i] = scan.nextInt();
		}
		System.out.println("Enter multiplier:");
		int k = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i ++){
			a[i] = a1[i] * k;
		}
		for (int i = n - 1; i > 0; i = i - 1){
			a[i - 1] += a[i] / 10;
			a[i] = a[i] % 10;
		}
		for ( int i = 0; i < n; i ++){
			System.out.print(a[i]);
		}
	}
}