public class Matrix2x2 {
	private double [][] a;
	public Matrix2x2() {
		this(0);
	}
	public Matrix2x2(double n){
		a = new double[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                this.a[i][j] = n;
            }
        }
	} 
	public Matrix2x2(double [][] a2){
		if (a2.length == 2 && a2[0].length == 2) {
            this.a = a2;
        }
	}
	public Matrix2x2 (double g, double b, double c, double d){
		this.a = new double[][]{{g, b}, {c, d}};
	}

	public Matrix2x2 add(Matrix2x2 a2){
		Matrix2x2 a3 = new Matrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				a3.a[i][j] = this.a[i][j] + a2.a[i][j];
			}
		}
		return a3;
	}
	public void add2(Matrix2x2 a2){
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				this.a[i][j] = this.a[i][j] + a2.a[i][j];
			}
		}
	}
	public Matrix2x2 sub(Matrix2x2 a2){
		Matrix2x2 a3 = new Matrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				a3.a[i][j] = this.a[i][j] - a2.a[i][j];
			}
		}
		return a3;
	} 
	public void sub2(Matrix2x2 a2){
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				this.a[i][j] = this.a[i][j] - a2.a[i][j];
			}
		}
	} 
	public Matrix2x2 multNumber(double n){
		Matrix2x2 a3 = new Matrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				a3.a[i][j] = this.a[i][j] * n;
			}
		}
		return a3;
	}
	public void multNumber2(double n){
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				this.a[i][j] = this.a[i][j] * n;
			}
		}
	}
	public Matrix2x2 mult(Matrix2x2 a2){
		Matrix2x2 a3 = new Matrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < a2.a[0].length; j ++ ){
				double sum = 0;
				for (int k = 0; k < this.a[0].length; k ++ ){
					sum += this.a[i][k] * a2.a[k][j];
				}
				a3.a[i][j] = sum;				
			}
		}
		return a3;
	} 
	public void mult2(Matrix2x2 a2){
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < a2.a[0].length; j ++ ){
				double sum = 0;
				for (int k = 0; k < this.a[0].length; k ++ ){
					sum += this.a[i][k] * a2.a[k][j];
				}
				this.a[i][j] = sum;				
			}
		}
	}
	public double det(){
		double det = this.a[0][0] * this.a[1][1] - this.a[1][0] * this.a[0][1];
		return det;
	}
	public void transpon() {
		Matrix2x2 a3 = new Matrix2x2(this.a);
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[0].length; j ++ ){
				this.a[i][j] = a3.a[j][i];
			}
		}
	}
	public Matrix2x2 inverseMatrix(){
		Matrix2x2 a3 = new Matrix2x2();
		if (this.det() == 0){
			System.out.println("There is no inverse matrix");
			return a3;
		}else{
			for (int i = 0; i < this.a.length; i ++ ){
				for (int j = 0; j < this.a[0].length; j ++ ){
					a3.a[i][j] = (this.a[1 - i][1 - j] * Math.pow(-1, (i + j))) / this.det(); 
				}	
			}
		}
		a3.transpon();
		return a3; 
	}
	public Matrix2x2 equivalentDiagonal() {
		Matrix2x2 a3 = new Matrix2x2();
		double k;
		for (int i = 0; i < this.a[0].length; i ++ ){
			for (int j = 0; j < this.a.length; j ++ ){
				if ((this.a[j][i] != 0) & (i + j > i + i)){
					k = -(this.a[j][i] / this.a[i][i]);
					for (int g = 0; g < this.a.length; g ++ ){
						a3.a[j][g] = this.a[j][g] + k * this.a[i][g];
					}
				}
			}
		}
		for (int i = (this.a[0].length - 1); i >= 0; i -- ){
			for (int j = (this.a.length - 1); j >= 0 ; j -- ){
				if ((this.a[j][i] != 0) & (i + j < i + i)){
					k = -(this.a[j][i] / this.a[i][i]);
					for (int g = (this.a.length - 1); g >= 0; g -- ){
						a3.a[j][g] = this.a[j][g] + k * this.a[i][g];
					}
				}
			}
		}
		return a3;
	}
	public Vector2D multVector(Vector2D v1){
		Vector2D v2 = new Vector2D();
		v2.setx( this.a[0][0] * v1.getx() + a[0][1] * v1.gety());
        v2.sety(this.a[1][0] * v1.getx() + a[1][1] * v1.gety());
        return v2;
	}
	public void output(){
		for (int i = 0; i < a.length; i ++){
			System.out.println();
			for (int j = 0; j < a[0].length; j ++){
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
	} 
}