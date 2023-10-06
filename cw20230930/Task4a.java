import java.util.Scanner;

public class Task4a{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter m:");
		int m = scan.nextInt();
		System.out.println("Enter n:");
		int n = scan.nextInt();
		int[][] a = new int [m][n];
		int [][] b = new int[m][n];
		int [][] c = new int[m][n];
		for (int i = 0; i < m; i ++){
			System.out.println("Enter " + (i+1) + " rows in matrix a:" );
			for (int j = 0; j < n; j ++){
				a[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i ++){
			System.out.println("Enter " + (i+1) + " rows in matrix b:" );
			for (int j = 0; j < n; j ++){
				b[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i ++){
			System.out.println();
			for (int j = 0; j < n; j ++){
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
		}

	}
}