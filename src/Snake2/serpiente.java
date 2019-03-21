package Snake2;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class serpiente {
	private Cuerpo cuerpo[];
	private int dir;
	
	public serpiente() {
		
		dir = 0;
		cuerpo = new Cuerpo[5];
	
		
		cuerpo[0]=new Cuerpo();
		cuerpo[0].setCenterX(100);
		cuerpo[0].setCenterY(100);
		cuerpo[0].setRadius(15);
		
		for(int a=1;a<5;a++) {

				cuerpo[a]=new Cuerpo();
				cuerpo[a].setCenterX(100);
				cuerpo[a].setCenterY(100);
				cuerpo[a].setRadius(10);
		}
		cuerpo[1].setCenterX(50);
		cuerpo[1].setCenterY(50);
		
	}

	public void moverse() {

		switch (dir){
		case 0:
			cuerpo[0].mover(cuerpo[0].getCenterX()+0.2,cuerpo[0].getCenterY());

			break;
		case 1:
			cuerpo[0].mover(cuerpo[0].getCenterX(),cuerpo[0].getCenterY()+0.2);

			break;
		case 2:
			cuerpo[0].mover(cuerpo[0].getCenterX(),cuerpo[0].getCenterY()-0.2);

			break;
		case 3:
			cuerpo[0].mover(cuerpo[0].getCenterX()-0.2,cuerpo[0].getCenterY());
		}
		//int m =3;
		//for(int n=4; n>=1;n--) {

		System.out.println("gt5x"+cuerpo[0].getx5()+"gt5y"+cuerpo[0].gety5() );
		
		
		cuerpo[1].mover(cuerpo[0].getx5(),cuerpo[0].gety5());
		
		System.out.println("gtx  "+cuerpo[1].getCenterX()+"   gty    "+cuerpo[1].getCenterY() );

			//m--;
		//}
	}

	
	
	public void setDir(int dir) {
		this.dir = dir;
	}

	public void addserpiente(Pane paneCancha) {
		for(int i = 0; i< cuerpo.length;i++)
			paneCancha.getChildren().add(cuerpo[i]);

	}
	


}
