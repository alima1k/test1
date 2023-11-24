public class ComplexMatrix2x2{
	private ComplexNumber x;
	private ComplexNumber [][] a;
	public ComplexMatrix2x2() {
		a = new ComplexNumber [2][2];
	}
	public ComplexMatrix2x2(ComplexNumber n) {
		a = new ComplexNumber[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                this.a[i][j] = n;
            }
        }
	}
	public ComplexMatrix2x2(ComplexNumber g, ComplexNumber b,  ComplexNumber c, ComplexNumber d){
		this.a = new ComplexNumber[][]{{g, b}, {c, d}};
	}
	public ComplexMatrix2x2 add(ComplexMatrix2x2 cm2){
		ComplexMatrix2x2 cm3 = new ComplexMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < this.a[i].length; j ++ ){
				cm3.a[i][j] = (this.a[i][j]).add(cm2.a[i][j]);
			}
		}
		return cm3;
	} 
	public ComplexMatrix2x2 mult(ComplexMatrix2x2 cm2){
		ComplexMatrix2x2 cm3 = new ComplexMatrix2x2();
		for (int i = 0; i < this.a.length; i ++ ){
			for (int j = 0; j < cm2.a[i].length; j ++ ){
				ComplexNumber sum = new ComplexNumber();
				for (int k = 0; k < this.a[i].length; k ++ ){
					sum.add2(this.a[i][k].mult(cm2.a[k][j]));
				}
				cm3.a[i][j] = sum;				
			}
		}
		return cm3;
	}
	public ComplexNumber det(){
		ComplexNumber a = this.a[0][0].mult(this.a[1][1]);
		ComplexNumber b = this.a[1][0].mult(this.a[0][1]);
		ComplexNumber det = a.sub(b);
		return det;
	} 
	public ComplexVector2D multVector(ComplexVector2D v1){
		ComplexVector2D cv3 = new ComplexVector2D();
		cv3.setx(( this.a[0][0].mult(v1.getx())).add(a[0][1].mult(v1.gety())));
        cv3.sety((this.a[1][0].mult(v1.getx())).add(a[1][1].mult(v1.gety())));
        return cv3;
	}
	public void output(){
		for (int i = 0; i < a.length; i ++){
			System.out.println();
			for (int j = 0; j < a[0].length; j ++){
				System.out.print(a[i][j].toString() + " ");
			}
		}
		System.out.println();
	} 
}