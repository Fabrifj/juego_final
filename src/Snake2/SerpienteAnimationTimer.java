package Snake2;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;

public class SerpienteAnimationTimer extends AnimationTimer {
	private	 int c=1;

	private serpiente snake;
	private Comida comida;
	private Pane paneCancha;
	public SerpienteAnimationTimer(serpiente snake, Pane paneCancha, Comida comida) {
		this.snake = snake;
		this.comida = comida;
		this.paneCancha = paneCancha;
	}

	@Override
	public void handle(long now) {
		this.mov_serpiente();
		this.colision_comida();
		this.colision_serpiente();
	}

	
	private void colision_comida(){
		if(comida.intersects(snake.getcabeza())) {
			comida.aparecer(paneCancha.getWidth(), paneCancha.getHeight());
			snake.setPuntaje(snake.getPuntaje()+1);
		}
	}

	private void colision_serpiente() {
		boolean choque1 = false;
		boolean choque2 = false;

		choque1 = snake.colision_cuerpo();
		choque2 = !(snake.getcabeza().intersects(30, 30, paneCancha.getWidth()-60, paneCancha.getHeight()-60));
		if(choque1 || choque2) {
			
			this.stop();
		}
	}
	
	private void mov_serpiente() {
		if(c>=1) {
			c--;
		}
		else {
			snake.moverse();
			c=1;
		}	
	}

}
