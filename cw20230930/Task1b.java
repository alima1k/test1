import java.util.Scanner;
public class Task1b{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		int n = scan.nextInt();
		int x = scan.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		for (int i = 0; i<n; i++){
			if (a[i] == x){
				flag = 1;
			}
		}
		if (flag == 1){
			System.out.println("Number in array");
		}else{
			System.out.println("Number not in array");
		}

	}
}