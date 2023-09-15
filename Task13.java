public class Task13 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i<=n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int s = n;
		System.out.println();
		for (int i = 1; i<= n; i++) {

			for ( int j = s; s >= 1; s = s-1){
				System.out.print("*");

			}
			System.out.println();
			s = n-i;
		}
		
		System.out.println();
		for ( int i = 1; i<=n; i++) {
			for ( int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int g = 1; g<= i; g++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}