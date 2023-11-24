import java.util.Scanner;
public class Menu{
	private Vector2D v1, v2;
	private Scanner scan = new Scanner(System.in);

	private void input(){
		System.out.println("Введите координаты первого вектора:");
		v1 = new Vector2D(scan.nextDouble(), scan.nextDouble());
		
		System.out.println("Введите координаты второго вектора:");
		v2 = new Vector2D(scan.nextDouble(), scan.nextDouble());
	}

	private void program(){
		System.out.println("Сложение векторов:");
		v1.add(v2);
		System.out.println("Вычитание одного вектора из другого:");
		v1.sub(v2);
		System.out.println("Умножение вектора на число:");
		System.out.println("Ведите число:");
		v1.mult(scan.nextDouble());
		System.out.println("Строковое представление вектора:");
		v1.toString();
		System.out.println("Длина вектора:");
		v1.length();
		System.out.println("Скалярное произведение векторов:");
		v1.scalarProduct(v2);
		System.out.println("Косинус угла между векторами:");
		v1.cos(v2);
		System.out.println("Сравнение векторов:");
		v1.equals(v2);


		
	}

	public static void main(String[] args){
		Menu m = new Menu();
		m.input();
		m.program();
	}
}