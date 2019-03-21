package Snake2;

import javafx.scene.shape.Circle;

public class Cuerpo extends Circle {
	private double  x[];
	private double y[];
	public Cuerpo() {
		super();
		x = new double[10];
		y = new double[10];
	}
	public void mover(double d, double e) {
		this.setCenterX(d);
		this.setCenterY(e);
		int a=9;
		x[0]= d;
		y[0]= e;
		System.out.println("---"+x[0]+"-----"+y[0]);
		for(int n=9; n>=1;n--) {
			y[n]= y[a];
			x[n]= x[a];
			a--;
			System.out.println("x en "+n+"--"+a+" es "+x[n]);

		}
	}

	public double getx5() {
		return x[9];
	}
	public double gety5() {
		return y[9];
	}
}

