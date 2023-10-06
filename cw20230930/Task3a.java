import java.util.Scanner;

public class Task3a {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of the number 1:");
		int n1 = scan.nextInt();
		System.out.println("Enter the length of the number 2:");
		int n2 = scan.nextInt();
		int n;
		if (n1 >= n2){
			n = n1;
		}else{
			n = n2;
		}
		int[] a1 = new int [n];
		int[] a2 = new int [n];
		int[] a = new int[n];
		System.out.println("Enter the number 1:");
		for (int i = 0; i < n; i ++ ){
			if (i < n - n1){
				a1[i] = 0;
			}else{
				a1[i] = scan.nextInt();
			}
		}
		System.out.println("Enter the number 2:");
		for (int i = 0; i < n; i ++ ){
			if (i < n - n2){
				a2[i] = 0;
			}else{
				a2[i] = scan.nextInt();
			}
		}
		for (int i = 0; i <= n - 1; i ++){
			a[i] = a1[i]+a2[i];
		}
		for (int i = n - 1; i > 0; i = i - 1){
			a[i - 1] = a[i - 1] + a[i]/10;
			a[i] = a[i]%10;
		}
		for (int i = 0; i < n; i ++){
			System.out.print(a[i]);
		}
		
	}
}


