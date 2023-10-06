import java.util.Scanner;
public class Task2b{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Write lenght of arrays:");
		int n = scan.nextInt();
		double sumb = 0;
		double suma = 0;
		double sum = 0;
		double cos = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Write array a:");
		for (int i = 0; i < n; i ++){
			a[i] = scan.nextInt();
			suma += a[i] * a[i];
		}
		System.out.println("Write array b:");
		for (int i = 0; i < n; i ++){
			b[i] = scan.nextInt();
			sumb += b[i] * b[i];
		}
		for (int i = 0; i < n; i ++){
			sum += a[i] * b[i];
		}
		cos = sum / (Math.sqrt(suma) * Math.sqrt(sumb));
		System.out.println("cos = " + cos);
		System.out.println(" Angle = " + Math.acos(cos));

	}
}