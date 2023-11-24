public class ComplexNumber{
	private double a;
	private double b;
	public ComplexNumber(){ //- конструктор для нулевого комплексного числа;
		this(0,0);
	}
	public ComplexNumber(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public ComplexNumber add(ComplexNumber n2){
		ComplexNumber n3 = new ComplexNumber();
		n3.a = this.a + n2.getA();
		n3.b = this.b + n2.getB();
		return n3;
	} 
	public void add2(ComplexNumber n2){
		this.a = this.a + n2.getA();
		this.b = this.b + n2.getB();
	}
	public ComplexNumber sub(ComplexNumber n2){
		ComplexNumber n3 = new ComplexNumber();
		n3.a = this.a - n2.getA();
		n3.b = this.b - n2.getB();
		return n3;
	}
	public void sub2(ComplexNumber n2){
		this.a = this.a - n2.getA();
		this.b = this.b - n2.getB();
	}
	public ComplexNumber multNumber(double k){
		ComplexNumber n3 = new ComplexNumber();
		n3.a = this.a * k;
		n3.b = this.b * 0;
		return n3;
	}
	public void multNumber2(double k){
		this.a = this.a * k;
		this.b = this.b * 0;
	} 
	public ComplexNumber mult(ComplexNumber n2){
		ComplexNumber n3 = new ComplexNumber();
		n3.a = this.a * n2.getA() - this.b * n2.getB();
		n3.b = this.b * n2.getA() + this.a * n2.getB();
		return n3;
	} 
	public void mult2(ComplexNumber n2){
		this.a = this.a * n2.getA() - this.b * n2.getB();
		this.b = this.b * n2.getA() + this.a * n2.getB();
	} 
	public ComplexNumber div(ComplexNumber n2){
		ComplexNumber n3 = new ComplexNumber();
		double h = n2.getA() * n2.getA() + n2.getB() * n2.getB();
		n3.a = (this.a * n2.getA() + this.b * n2.getB()) / (h);
		n3.b = (this.b * n2.getA() - this.a * n2.getB()) / (h);
		return n3;
	} 
	public void div2(ComplexNumber n2){
		double h = n2.getA() * n2.getA() + n2.getB() * n2.getB();
		this.a = (this.a * n2.getA() + this.b * n2.getB()) / (h);
		this.b = (this.b * n2.getA() - this.a * n2.getB()) / (h);
	} 
	public double length(){
		double len = Math.sqrt(a * a + b * b);
		return len;
	}
	public String toString() {
		String sign = "+";
		if (this.b < 0){
			sign = "";
		}
		String str = a + " " + sign + " "+ b + " i";
		return str;
	}
	public double arg(){
		double arg = 0;
		if (this.a > 0){
			arg = Math.atan(this.b / this.a);
		}else if ((this.a < 0) && (this.b >= 0)){
			arg = Math.atan(this.b / this.a) + Math.PI;
		}else if ((this.a < 0) && (this.b < 0)){
			arg = Math.atan(this.b / this.a) - Math.PI;
		}else if ((this.a == 0) && (this.b > 0)){
			arg = Math.PI / 2;
		}else if ((this.a == 0) && (this.b < 0)){
			arg = -Math.PI / 2;
		}
		return arg;
	}
	public ComplexNumber pow(double n){
		ComplexNumber n3 = new ComplexNumber();
		n3.a = Math.pow(this.length(), n) * Math.cos(n * this.arg());
		n3.b = Math.pow(this.length(), n) * Math.sin(n * this.arg());
		return n3;
	}
	public boolean equals(ComplexNumber n2){
		if ((this.a == n2.getA()) && (this.b == n2.getB())){
			return true;
		}else{
			return false;
		}
	}  
}
