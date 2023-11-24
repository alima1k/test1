public class RationalComplexVector2D{
	private RationalComplexNumber x, y;
	public RationalComplexVector2D() {
		this(new RationalComplexNumber(), new RationalComplexNumber());
	}
	public RationalComplexVector2D(RationalComplexNumber x, RationalComplexNumber y){
		this.x = x;
		this.y = y;
	}
	public RationalComplexVector2D add(RationalComplexVector2D cv2){
		RationalComplexVector2D cv3 = new RationalComplexVector2D();
		cv3.x = this.x.add(cv2.x);
		cv3.y = this.y.add(cv2.y);
		return cv3;
	}
	public String toString(){
		String str = "Координата x = " + this.x.toString() + ", координата y = " + this.y.toString();
		return str;
	}
	public RationalComplexNumber scalarProduct(RationalComplexVector2D cv2){
		RationalComplexVector2D cv3 = new RationalComplexVector2D();
		RationalComplexNumber xx = (this.x).mult(cv2.x);
		RationalComplexNumber yy = (this.y).mult(cv2.y);
		RationalComplexNumber scalarProduct = xx.add(yy);
		return scalarProduct;
	}
	public void setx(RationalComplexNumber x){
		this.x = x;
	} 
	public void sety(RationalComplexNumber y){
		this.y = y;
	}
	public RationalComplexNumber getx(){
		return x;
	} 
	public RationalComplexNumber gety(){
		return y;
	} 
}