public class Task7 {
	public static void main (String[] args) {
		int x = 0;
		int y = 4;
		int r;
		if (x*x+y*y <= 16) {
			if ((x*x)+(y+2)*(y+2)<=4) {
				r=1;
			}else if ((x*x)+(y-2)*(y-2)<=4) {
				r=0;
			}else if (x>=0) {
				r=1;
			}else {
				r=0;
			}
		} else {
			r=0;
		}
		if (r==1) {
			System.out.println("x,y inside the area");
		} else {
			System.out.println("x,y outside the area");
		}
	}
}