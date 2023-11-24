public class Vector2D{
	private double x;
	private double y;
	public Vector2D(){//- конструктор для нулевого вектора;
		this(0,0); 
	} 
	public Vector2D(double x, double y){//- конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
		this.x = x;
		this.y = y;
    }
	public Vector2D add(Vector2D v2){//- сложение вектора с другим вектором, результат возвращается как новый объект.
		Vector2D v3 = new Vector2D();
		v3.x = x + v2.getx();
		v3.y = y + v2.gety();
		return v3;
	} 
	public void add2(Vector2D v2){
		this.x += v2.getx();
		this.y += v2.gety();
	} // - сложение вектора с другим вектором, результат сохраняется в том, у кого был вызван этот метод;
	public Vector2D sub(Vector2D v2){
		Vector2D v3 = new Vector2D();
		v3.x = x + v2.getx();
		v3.y = y + v2.gety();
		return v3;

	} //- вычитание из вектора другого вектора, результат возвращается как новый объект;
	public void sub2(Vector2D v2){
		this.x -= v2.getx();
		this.y -= v2.gety();
	} //- вычитание из вектора другого вектора, результат сохраняется в том векторе, у кого был вызван этот метод;
	public Vector2D mult(double n){
		Vector2D v3 = new Vector2D();
		v3.x = x * n;
		v3.y = y * n;
		return v3;

	} //- умножение вектора на вещественное число, результат возвращается как новый объект;
	public void mult2(double n){//- умножение вектора на вещественное число, результат сохраняется в векторе;
		this.x = this.x * n;
		this.y = this.y * n;
	} 

	public String toString(){
		String str = "Координата x = " + this.x + ", координата y = " + this.y;
		return str;

	} //- строковое представление вектора;
	public double length(){
		double len = Math.sqrt(x * x + y * y);
		return len;

	} //- длина вектора;
	public double scalarProduct(Vector2D v2){//- скалярное произведение вектора на другой вектор;
		double scalar = this.length() * v2.length() * this.cos(v2);
		return scalar;

	} 
	public double cos(Vector2D v2){ //- косинус угла между этим и другим вектором;
		double cos = ((this.x * v2.getx() + this.y * v2.gety())/(this.length() * v2.length()));
		return cos;
	}
	public boolean equals(Vector2D v2){ //- сравнить вектор с другим вектором;
		if (((this.x - v2.getx()) < 0.000001) & ((this.y - v2.gety()) < 0.000001)){
			return true;
		}
		else{
			return false;
		}
	} 
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public void setx(double x){
		this.x = x;
	}
	public void sety(double y){
		this.y = y;
	}
}