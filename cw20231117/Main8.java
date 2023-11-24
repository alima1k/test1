import java.util.Scanner;
public class Main8{
	private ComplexMatrix2x2 cm1, cm2, cm3;
	private ComplexNumber n1, n2, n3, n4, x1, y1;
	private ComplexVector2D v1, v2;
	private Scanner scan = new Scanner(System.in);
	private ComplexMatrix2x2 elements(){
		System.out.println("Введите первый элемент матрицы (сначала действительную часть): ");
		n1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		System.out.println("Введите второй элемент матрицы(сначала действительную часть): ");
		n2 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		System.out.println("Введите третий элемент матрицы (сначала действительную часть): ");
		n3 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		System.out.println("Введите четвертый элемент матрицы(сначала действительную часть): ");
		n4 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		ComplexMatrix2x2 m = new ComplexMatrix2x2(n1, n2, n3, n4);
		return m;
	}
	private void input(){
		System.out.println("Первая матрица: ");
		cm1 = elements();
		System.out.println("Вторая матрица: ");
		cm2 = elements();

	}
	private void program(){
		cm3 = cm1.add(cm2);
		System.out.println("Сложение: ");
		cm3.output();
		cm3 = cm1.mult(cm2);
		System.out.println("Умножение: " );
		cm3.output();
		ComplexNumber det = cm1.det();
		System.out.println("Определитель: " + det);
		System.out.println("На какой вектор умножить матрицу?");
		x1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		y1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		v1 = new ComplexVector2D(x1, y1);
		v2 = cm1.multVector(v1);
		System.out.println(v2);
	}

	public static void main(String[] args){
		Main8 m = new Main8();
		m.input();
		m.program();
	}
}
