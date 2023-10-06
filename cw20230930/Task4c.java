import java.util.Scanner;


public class Task4c{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter n:");
		int n = scan.nextInt();
		int flag = 0;
		double k = 0;
		double[][] a = new double[n][n];
		for (int i = 0; i < n; i ++){
			System.out.println("Enter the " + (i + 1) + " row in matrix:");
			for (int j = 0; j < n; j ++){
				a[i][j] = scan.nextDouble();
			}
		}
		for (int i = 0; i < n; i ++){
			for (int j = 1; j < n; j ++){ 
				if ((a[j][i] != 0) & (i + j > i + i)){
					k=-(a[j][i]/a[i][i]);
					for (int g = 0; g < n; g ++){
						a[j][g] = a[j][g] + k * a[i][g];
					}
				}
			}
		}
		for (int i = 0; i < n; i ++){
			for (int j = 0; j < n; j ++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}