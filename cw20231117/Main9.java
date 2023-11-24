import java.util.Scanner;
public class Main9{
	private RationalComplexNumber rc1, rc2, rc3;
	private RationalFraction n1, n2;
	private Scanner scan = new Scanner(System.in);
	public RationalComplexNumber elements(){
		System.out.println("Введите действительную часть комплексного числа (сначала числитель):");
		n1 = new RationalFraction(scan.nextInt(), scan.nextInt());
		System.out.println("Введите мнимую часть комплексного числа (сначала числитель):");
		n2 = new RationalFraction(scan.nextInt(), scan.nextInt());
		RationalComplexNumber n = new RationalComplexNumber(n1, n2);
		return n;
	}
	private void input(){
		System.out.println("Первое число");
		rc1 = elements();
		System.out.println("Второе число");
		rc2 = elements();
	}
	private void program(){
		rc3 = rc1.add(rc2);
		System.out.println("Сложение: " + rc3);
		rc3 = rc1.sub(rc2);
		System.out.println("Разность: " + rc3);
		rc3 = rc1.mult(rc2);
		System.out.println("Умножение: " + rc3);


	}
	public static void main(String[] args){
		Main9 m = new Main9();
		m.input();
		m.program();
	}
}