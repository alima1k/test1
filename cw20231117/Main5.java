import java.util.Scanner;
public class Main5{
		private RationalFraction x1, y1, x2, y2, r;
		private RationalVector2D rv1, rv2, rv3;
		private Scanner scan = new Scanner(System.in);
		private void input(){
			System.out.println("Введите первую координату первого вектора(сначала числитель): ");
			x1 = new RationalFraction(scan.nextInt(), scan.nextInt());
			System.out.println("Введите вторую координату первого вектора(сначала числитель): ");
			y1 = new RationalFraction(scan.nextInt(), scan.nextInt());
			rv1 = new RationalVector2D(x1, y1);
			System.out.println("Введите первую координату второго вектора(сначала числитель): ");
			x2 = new RationalFraction(scan.nextInt(), scan.nextInt());
			System.out.println("Введите вторую координату второго вектора(сначала числитель): ");
			y2 = new RationalFraction(scan.nextInt(), scan.nextInt());
			rv2 = new RationalVector2D(x2, y2);


		}
		private void program(){
			rv3 = rv1.add(rv2);
			System.out.println("Сложение: " + rv3);
			double len = rv1.length();
			System.out.println("Длина: " + len);
			RationalFraction r = rv1.scalarProduct(rv2);
			System.out.println("Скалярное произведение: " + r);
			boolean equals = rv1.equals(rv2);
			System.out.println("Равенство: " + equals);

		}
		public static void main(String[] args){
			Main5 m = new Main5();
			m.input();
			m.program();

		}


	
}