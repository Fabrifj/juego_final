package Snake2;

import java.util.Random;

import javafx.scene.shape.Circle;

public class Comida extends Circle {
	private Random ran;

	public Comida() {
		this.setCenterX(-20);
		this.setCenterX(-20);
		this.setRadius(5);
		ran =new Random();


	}
	public void aparecer(double d,double e) {
		int a= (int) d;
		int h= (int) e;
		
		this.setCenterX(ran.nextInt((int)(a-2*this.getRadius()))+(int)this.getRadius());
		this.setCenterY(ran.nextInt((int)(h-2*this.getRadius()))+(int)this.getRadius());

	}
}
