package Snake2;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class serpiente {
	private Cuerpo cuerpo[];
	private int dir;
	private int retro;
	private int puntaje;
	private boolean choque;
	private int tam;
	
	public serpiente() {
		this.choque=false;
		this.tam = 4;
		this.puntaje = 0;
		this.dir = 0;
		cuerpo = new Cuerpo[50];
		retro= 3-dir;
		
		cuerpo[0]=new Cuerpo();
		cuerpo[0].setCenterX(100);
		cuerpo[0].setCenterY(100);
		cuerpo[0].setRadius(12);
		
		for(int a=1;a<50;a++) {

				cuerpo[a]=new Cuerpo();
				cuerpo[a].setCenterX(0);
				cuerpo[a].setCenterY(0);
				cuerpo[a].setRadius(10);
		}

	}

	public void moverse() {

		switch (dir){
		case 0:
			cuerpo[0].mover(cuerpo[0].getCenterX()+1,cuerpo[0].getCenterY());

			break;
		case 1:
			cuerpo[0].mover(cuerpo[0].getCenterX(),cuerpo[0].getCenterY()+1);

			break;
		case 2:
			cuerpo[0].mover(cuerpo[0].getCenterX(),cuerpo[0].getCenterY()-1);

			break;
		case 3:
			cuerpo[0].mover(cuerpo[0].getCenterX()-1,cuerpo[0].getCenterY());
		}
		int m =tam-1;
		for(int n=tam; n>=1;n--) {
			cuerpo[n].mover(cuerpo[m].getx5(),cuerpo[m].gety5());
			m--;
		}
	}

	
	
	public int getRetro() {
		return retro;
	}

	public void setDir(int dir) {
		this.dir = dir;
	
	}

	public void addserpiente(Pane paneCancha) {
		for(int i = 0; i< cuerpo.length;i++)
			paneCancha.getChildren().add(cuerpo[i]);

	}

	public void setRetro(int dir) {
		this.retro = 3-dir;
	}
	

	public Bounds getcabeza() {
		return cuerpo[0].getBoundsInParent();
		
	}
	boolean choque1 = false;


	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
		this.tam += 1;
	}

	public boolean colision_cuerpo() {
		for(int a =4; a<=tam;a++) {
			if(cuerpo[0].intersects(cuerpo[a].getBoundsInLocal())) {
				System.out.println("hay choque "+a);
				choque = true;
				break;
			}
		}
		return choque;
			
	}
	
}
