public class Task14 {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=2*n-i; j++){
				System.out.print(" ");

			}
			for (int g = 1; g<=i*2-1; g+=1 ) {
				System.out.print("*");

			}
			for (int j = 1; j<=2*n-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i =1; i<= n; i++) {
			for ( int j =1; j<=n-i; j++) {
				System.out.print(" ");

			}
			for (int g =1;g<=2*i-1; g++ ) {
				System.out.print("*");
			}
			for (int h = 1; h<=2*n-(2*i-1); h++) {
				System.out.print(" ");
			}
			for (int k =1;k<=2*i-1; k++ ) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}