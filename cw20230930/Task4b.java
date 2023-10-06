import java.util.Scanner;

public class Task4b{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter k:");
		int k = scan.nextInt();
		System.out.println("Enter m:");
		int m = scan.nextInt();
		System.out.println("Enter n:");
		int n = scan.nextInt();
		int[][] a = new int[k][m];
		int[][] b = new int[m][n];
		int[][] c = new int[k][n];
		int c1 = 0;
		for (int i = 0; i < k; i ++){
			System.out.println("Enter the " + (i + 1) + " row in matrix a:");
			for (int j = 0; j < m; j++){
				a[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i ++){
			System.out.println("Enter the " + (i + 1) + " row in matrix b:");
			for (int j = 0; j < n; j ++){
				b[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < k; i ++){ //номер строки
			for (int j = 0; j < n; j ++){ // номер столбца
				for (int g = 0; g < m; g ++){ //номер элемента
					c1 += a[i][g]*b[g][j];
				}
			
			c[i][j] = c1;
			c1 = 0;
		    }
		}
		for (int i = 0; i < k; i ++){
			for (int j = 0; j < n; j ++){
				System.out.print( c[i][j] + " ");
			}
			System.out.println();
		}
	}
}