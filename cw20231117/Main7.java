
import java.util.Scanner;
public class Main7{
	private RationalMatrix2x2 rm1, rm2, rm3;
	private RationalFraction r1, r2, r3, r4, x1, y1;
	private RationalVector2D v1, v2;
	private Scanner scan = new Scanner(System.in);
	private RationalMatrix2x2 elements(){
		System.out.println("Введите первый элемент матрицы (сначала числитель): ");
		r1 = new RationalFraction(scan.nextInt(), scan.nextInt());
		System.out.println("Введите второй элемент матрицы(сначала числитель): ");
		r2 = new RationalFraction(scan.nextInt(), scan.nextInt());
		System.out.println("Введите третий элемент матрицы (сначала числитель): ");
		r3 = new RationalFraction(scan.nextInt(), scan.nextInt());
		System.out.println("Введите четвертый элемент матрицы(сначала числитель): ");
		r4 = new RationalFraction(scan.nextInt(), scan.nextInt());
		RationalMatrix2x2 m = new RationalMatrix2x2(r1, r2, r3, r4);
		return m;
	}
	private void input(){
		System.out.println("Первая матрица: ");
		rm1 = elements();
		System.out.println("Вторая матрица: ");
		rm2 = elements();

	}
	private void program(){
		rm3 = rm1.add(rm2);
		System.out.println("Сложение: ");
		rm3.output();
		rm3 = rm1.mult(rm2);
		System.out.println("Умножение: " );
		rm3.output();
		RationalFraction det = rm1.det();
		System.out.println("Определитель: " + det);
		System.out.println("На какой вектор умножить матрицу?");
		x1 = new RationalFraction(scan.nextInt(), scan.nextInt());
		y1 = new RationalFraction(scan.nextInt(), scan.nextInt());
		v1 = new RationalVector2D(x1, y1);
		v2 = rm1.multVector(v1);
		System.out.println(v2);
	}

	public static void main(String[] args){
		Main7 m = new Main7();
		m.input();
		m.program();
	}
}
