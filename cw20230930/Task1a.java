import java.util.Scanner;
public class Task1a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int [n];
		for (int i = 0 ; i < n; i++){
			a[i] = scan.nextInt();
		}
		int start = 0;
		int end = n-1;
		while ((start <= end) & (flag == 0)){
			int mid = (start + end) / 2;
			if (a[mid] == x){
				flag = 1;
				
			}else if (a[mid] > x){
				end = mid - 1;
			}else if ( a[mid] < x) {
				start = mid + 1;
			}
		}
		if (flag == 1){
				System.out.println("Number in array");
		}else{
				System.out.println("Number not in array");
		}
		
	}
}