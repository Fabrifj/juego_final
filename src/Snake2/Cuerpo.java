package Snake2;

import javafx.scene.shape.Circle;

public class Cuerpo extends Circle {
	private double  x[];
	private double y[];
	public Cuerpo() {
		super();
		x = new double[20];
		y = new double[20];
	}
	public void mover(double d, double e) {
		this.setCenterX(d);
		this.setCenterY(e);
		int a=18;
		x[0]= d;
		y[0]= e;
		for(int n=19; n>=1;n--) {
			y[n]= y[a];
			x[n]= x[a];
			a--;
		}
	}

	public double getx5() {
		return x[19];
	}
	public double gety5() {
		return y[19];
	}
}

