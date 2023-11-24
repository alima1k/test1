import java.util.Scanner;
public class Main4{
	private Matrix2x2 a1, a2, a3;
	private Vector2D v1, v2;
	private Scanner scan = new Scanner(System.in);
	private void input(){
		double [][] a = new double[2][2];
		for (int i = 0; i < a.length; i ++){
			System.out.println("Введите " + (i + 1) + " строку в 1-ой матрице:");
			for (int j = 0; j < a[0].length; j ++){
				a[i][j] = scan.nextDouble();
			}
		}
		a1 = new Matrix2x2(a);
		double [][] b = new double[2][2];
		for (int i = 0; i < b.length; i ++){
			System.out.println("Введите " + (i + 1) + " строку в 2-ой матрице:");
			for (int j = 0; j < b[0].length; j ++){
				b[i][j] = scan.nextDouble();
			}
		}
		a2 = new Matrix2x2(b);
	}
	private void program(){
		a3 = a1.add(a2);
		System.out.println("Сложение: ");
		a3.output();
		a3 = a1.sub(a2);
		System.out.println("Вычитание: " );
		a3.output();
		System.out.println("На какое число умножить?");
		double n = scan.nextDouble();
		a3 = a1.multNumber(n);
		System.out.println("Умножение на число: " );
		a3.output();
		a3 = a1.mult(a2);
		System.out.println("Умножение: " );
		a3.output();
		double det = a1.det();
		System.out.println("Определитель: " + det);
		a3 = a1.inverseMatrix();
		System.out.println("Обратная: ");
		a3.output();
		a3 = a1.equivalentDiagonal();
		System.out.println("Диагональная: ");
		a3.output();
		System.out.println("На какой вектор умножить матрицу?");
		v1 = new Vector2D(scan.nextDouble(), scan.nextDouble());
		v2 = a1.multVector(v1);
		System.out.println(v2);
	}

	public static void main(String[] args){
		Main4 m = new Main4();
		m.input();
		m.program();
	}
}