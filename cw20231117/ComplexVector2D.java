public class ComplexVector2D{
	private ComplexNumber x, y;
	public ComplexVector2D(){
		this(new ComplexNumber(), new ComplexNumber());
	}
	public ComplexVector2D(ComplexNumber x, ComplexNumber y){
		this.x = x;
		this.y = y;
	}
	public ComplexVector2D add(ComplexVector2D cv2){
		ComplexVector2D cv3 = new ComplexVector2D();
		cv3.x = this.x.add(cv2.x);
		cv3.y = this.y.add(cv2.y);
		return cv3;
	} 
	public String toString() {
		String str = "Координата x = " + this.x.toString() + ", координата y = " + this.y.toString();
		return str;
	}
	public ComplexNumber scalarProduct(ComplexVector2D cv2){
		ComplexNumber scalarProduct = new ComplexNumber();
		ComplexNumber xx = this.x.mult(cv2.x);
		ComplexNumber yy = this.y.mult(cv2.y);
		scalarProduct = xx.add(yy);
		return scalarProduct;
	}
	public boolean equals(ComplexVector2D cv2) {
		if (this.x.equals(cv2.x) && this.y.equals(cv2.y)){
			return true;
		}else{
			return false;
		}
	}
	public void setx(ComplexNumber x){
		this.x = x;
	}
	public void sety(ComplexNumber y){
		this.y = y;
	}
	public ComplexNumber getx(){
		return x;
	}
	public ComplexNumber gety(){
		return y;
	}

}