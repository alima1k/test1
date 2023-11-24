import java.util.Scanner;
public class Main6{
		private ComplexNumber x1, y1, x2, y2;
		private ComplexVector2D cv1, cv2, cv3;
		private Scanner scan = new Scanner(System.in);
		private void input(){
			System.out.println("Введите первую координату первого вектора(сначала действительную часть): ");
			x1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
			System.out.println("Введите вторую координату первого вектора(сначала действительную часть): ");
			y1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
			cv1 = new ComplexVector2D(x1, y1);
			System.out.println("Введите первую координату второго вектора(сначала действительную часть): ");
			x2 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
			System.out.println("Введите вторую координату второго вектора(сначала действительную часть): ");
			y2 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
			cv2 = new ComplexVector2D(x2, y2);


		}
		private void program(){
			cv3 = cv1.add(cv2);
			System.out.println("Сложение: " + cv3);
			ComplexNumber n = cv1.scalarProduct(cv2);
			System.out.println("Скалярное произведение: " + n);
			boolean equals = cv1.equals(cv2);
			System.out.println("Равенство: " + equals);

		}
		public static void main(String[] args){
			Main6 m = new Main6();
			m.input();
			m.program();

		}


	
}