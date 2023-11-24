public class Main10{
	private Main9 m;
	private RationalComplexNumber x, v1, v2, v3, v4;
	private RationalComplexVector2D rc1, rc2, rc3;

	private void input(){
		m = new Main9();
		System.out.println("Первый вектор: ");
		System.out.println("Первая координата");
		v1 = m.elements();
		System.out.println("Вторая координата");
		v2 = m.elements();
		rc1 = new RationalComplexVector2D(v1, v2);
		System.out.println("Второй вектор: ");
		System.out.println("Первая координата");
		v3 = m.elements();
		System.out.println("Вторая координата");
		v4 = m.elements();
		rc2 = new RationalComplexVector2D(v3, v4);
	} 
	private void program(){
		rc3 = rc1.add(rc2);
		System.out.println("Сложение: " + rc3);
		x = rc1.scalarProduct(rc2);
		System.out.println("Скалярное произведение: " + x);
	}
	public static void main(String [] args){
		Main10 n = new Main10();
		n.input();
		n.program();
	}
}