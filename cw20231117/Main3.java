import java.util.Scanner;
public class Main3{
	private ComplexNumber n1, n2, n3;
	private Scanner scan = new Scanner(System.in);
	private void input(){
		System.out.println("Введите сначала действительную, а потом мнимую часть первого числа: ");
		n1 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
		System.out.println("Введите сначала действительную, а потом мнимую часть второго числа: ");
		n2 = new ComplexNumber(scan.nextDouble(), scan.nextDouble());
	}
	private void program(){
		n3 = n1.add(n2);
		System.out.println("Сложение: " + n3);
		n3 = n1.sub(n2);
		System.out.println("Вычитание: " + n3);
		System.out.println("На какое число умножить?");
		double n = scan.nextDouble();
		n3 = n1.multNumber(n);
		n3 = n1.mult(n2);
		System.out.println("Умножение: " + n3);
		n3 = n1.div(n2);
		System.out.println("Деление: " + n3);
		double len = n1.length();
		System.out.println("Модуль: " + n3);
		String str = n1.toString();
		System.out.println("Строковая запись: " + str);
		double arg = n1.arg();
		System.out.println( "Аргумент: " + arg);
		n3 = n1.pow(2.0);
		System.out.println("Число в степени 2: " + n3);
		boolean a = n1.equals(n2);
		System.out.println(a);
	}
	public static void main(String [] args){
		Main3 m = new Main3();
		m.input();
		m.program();
	}
}