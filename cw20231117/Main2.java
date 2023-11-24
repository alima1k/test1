import java.util.Scanner;
public class Main2{
	private RationalFraction d1, d2, d3;
	private Scanner scan = new Scanner(System.in);
	private void input(){
		System.out.println("Введите первую дробь(сначала числитель):");
		d1 = new RationalFraction(scan.nextInt(), scan.nextInt());
		
		System.out.println("Введите вторую дробь(сначала числитель):");
		d2 = new RationalFraction(scan.nextInt(), scan.nextInt());
	}
	private void program(){
		d1.reduce();
		d3 = d1.add(d2);
		System.out.println("Сложение: " + d3);
		d3 = d1.sub(d2);
		System.out.println("Вычитание: " + d3);
		d3 = d1.mult(d2);
		System.out.println("Умножение: " + d3);
		d3 = d1.div(d2);
		System.out.println("Деление: " + d3);
		String str = d1.toString();
		System.out.println(str);
		double value = d1.value();
		System.out.println(value);
		boolean a = d1.equals(d2);
		System.out.println(a);
		int n = d1.numberPart();
		System.out.println(n);

		
	}
	public static void main(String[] args){
		Main2 m = new Main2();
		m.input();
		m.program();
		

	}
}