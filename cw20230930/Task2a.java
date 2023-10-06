import java.util.Scanner;
public class Task2a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double s = 0;
		System.out.println("Write lenght of arrays:");
		int n = scan.nextInt();
		int[] a = new int [n];
		int[] b = new int [n];
		System.out.println("Write array a:");
		for (int i = 0; i < n; i ++){
			a[i] = scan.nextInt();
		}
		System.out.println("Write array b:");
		for (int i = 0; i < n; i ++){
			b[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i ++){
			s += a[i] * b[i];

		}
		System.out.println("Sum = " + s);
	}
}