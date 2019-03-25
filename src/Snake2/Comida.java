package Snake2;

import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Comida extends Circle {
	private Random ran;
	private Image im;

	public Comida() {
		this.setCenterX(-20);
		this.setCenterX(-20);
		this.setRadius(5);
		ran =new Random();
		im = new Image("/Snake2/src/Snake2/imagenes/raton1.jpg");
		this.setFill(new ImagePattern(im));
//raton1.jpg
	}
	public void aparecer(double d,double e) {
		int a= (int) d;
		int h= (int) e;
		
		this.setCenterX(ran.nextInt((int)(a-3*this.getRadius()))+(int)2*this.getRadius());
		this.setCenterY(ran.nextInt((int)(h-3*this.getRadius()))+(int)2*this.getRadius());

	}
}
