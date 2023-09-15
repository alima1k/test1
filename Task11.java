public class Task11 {
	public static void main(String[] args) {
		int s = 0;
		int a;
		for (String arg : args) {
			a = Integer.parseInt(arg);
			s+= a;
		}
		System.out.println(s);

	}
}